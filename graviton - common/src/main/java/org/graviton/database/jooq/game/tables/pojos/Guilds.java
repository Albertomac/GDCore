/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.game.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Guilds implements Serializable {

    private static final long serialVersionUID = -310656912;

    private final Integer id;
    private final String  name;
    private final String  emblem;
    private final Short   level;
    private final Long    experience;
    private final Integer capital;
    private final Integer limit;
    private final String  spells;
    private final Short   wisdom;
    private final Short   pods;
    private final Short   prospection;

    public Guilds(Guilds value) {
        this.id = value.id;
        this.name = value.name;
        this.emblem = value.emblem;
        this.level = value.level;
        this.experience = value.experience;
        this.capital = value.capital;
        this.limit = value.limit;
        this.spells = value.spells;
        this.wisdom = value.wisdom;
        this.pods = value.pods;
        this.prospection = value.prospection;
    }

    public Guilds(
        Integer id,
        String  name,
        String  emblem,
        Short   level,
        Long    experience,
        Integer capital,
        Integer limit,
        String  spells,
        Short   wisdom,
        Short   pods,
        Short   prospection
    ) {
        this.id = id;
        this.name = name;
        this.emblem = emblem;
        this.level = level;
        this.experience = experience;
        this.capital = capital;
        this.limit = limit;
        this.spells = spells;
        this.wisdom = wisdom;
        this.pods = pods;
        this.prospection = prospection;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmblem() {
        return this.emblem;
    }

    public Short getLevel() {
        return this.level;
    }

    public Long getExperience() {
        return this.experience;
    }

    public Integer getCapital() {
        return this.capital;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getSpells() {
        return this.spells;
    }

    public Short getWisdom() {
        return this.wisdom;
    }

    public Short getPods() {
        return this.pods;
    }

    public Short getProspection() {
        return this.prospection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Guilds (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(emblem);
        sb.append(", ").append(level);
        sb.append(", ").append(experience);
        sb.append(", ").append(capital);
        sb.append(", ").append(limit);
        sb.append(", ").append(spells);
        sb.append(", ").append(wisdom);
        sb.append(", ").append(pods);
        sb.append(", ").append(prospection);

        sb.append(")");
        return sb.toString();
    }
}
