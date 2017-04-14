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
public class Items implements Serializable {

    private static final long serialVersionUID = 1377358514;

    private final Integer id;
    private final Integer owner;
    private final Short   template;
    private final Short   quantity;
    private final Byte    position;
    private final String  statistics;

    public Items(Items value) {
        this.id = value.id;
        this.owner = value.owner;
        this.template = value.template;
        this.quantity = value.quantity;
        this.position = value.position;
        this.statistics = value.statistics;
    }

    public Items(
        Integer id,
        Integer owner,
        Short   template,
        Short   quantity,
        Byte    position,
        String  statistics
    ) {
        this.id = id;
        this.owner = owner;
        this.template = template;
        this.quantity = quantity;
        this.position = position;
        this.statistics = statistics;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getOwner() {
        return this.owner;
    }

    public Short getTemplate() {
        return this.template;
    }

    public Short getQuantity() {
        return this.quantity;
    }

    public Byte getPosition() {
        return this.position;
    }

    public String getStatistics() {
        return this.statistics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Items (");

        sb.append(id);
        sb.append(", ").append(owner);
        sb.append(", ").append(template);
        sb.append(", ").append(quantity);
        sb.append(", ").append(position);
        sb.append(", ").append(statistics);

        sb.append(")");
        return sb.toString();
    }
}
