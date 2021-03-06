package org.graviton.network.game.handler;

import lombok.extern.slf4j.Slf4j;
import org.graviton.database.entity.EntityFactory;
import org.graviton.game.client.player.Player;
import org.graviton.game.creature.npc.Npc;
import org.graviton.game.creature.npc.NpcAnswer;
import org.graviton.network.game.GameClient;
import org.graviton.network.game.protocol.NpcPacketFormatter;

import java.util.List;

/**
 * Created by Botan on 07/12/2016. 20:27
 */

@Slf4j
public class DialogHandler {
    private final GameClient client;
    private final EntityFactory entityFactory;
    private Player player;

    public DialogHandler(GameClient client) {
        this.client = client;
        this.entityFactory = client.getEntityFactory();
    }

    private Player getPlayer() {
        return this.player != null ? this.player : (player = client.getPlayer());
    }

    public void handle(String data, char subHeader) {
        switch (subHeader) {
            case 'C':
                createDialog(data);
                break;

            case 'R':
                answerDialog(data);
                break;

            case 'V':
                leaveDialog();
                break;

            default:
                log.error("not implemented dialog packet '{}'", subHeader);

        }
    }

    private void createDialog(String data) {
        int id = Integer.parseInt(data);

        client.getInteractionManager().setInteractionWith(id);

        Npc npc = (Npc) getPlayer().getMap().getCreature(id);

        client.send(NpcPacketFormatter.createDialog(id));
        client.send(NpcPacketFormatter.questionMessage(entityFactory.getNpcQuestion(npc.getTemplate().getInitialQuestion(getPlayer().getMap().getId())).toString(player)));
    }

    public void createQuestion(String data) {
        if ("DV".equals(data)) {
            leaveDialog();
            return;
        }

        client.send(NpcPacketFormatter.questionMessage(entityFactory.getNpcQuestion(Short.parseShort(data)).toString(player)));
    }

    private void answerDialog(String data) {
        List<NpcAnswer> answers = entityFactory.getNpcAnswer(Short.parseShort(data.split("\\|")[1]));

        answers.forEach(answer -> {
            if(answer.getNpcAction() == null) {
                System.err.println("NULL :D" + answer.TEST);
            }

            answer.getNpcAction().apply(client, answer.getData());
        });
    }

    public void leaveDialog() {
        client.getInteractionManager().setInteractionWith(0);
        client.send(NpcPacketFormatter.quitMessage());
    }

}
