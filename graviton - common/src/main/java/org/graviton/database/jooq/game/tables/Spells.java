/*
 * This file is generated by jOOQ.
*/
package org.graviton.database.jooq.game.tables;


import javax.annotation.Generated;

import org.graviton.database.jooq.game.Game;
import org.graviton.database.jooq.game.tables.records.SpellsRecord;
import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Spells extends TableImpl<SpellsRecord> {

    private static final long serialVersionUID = 853339877;

    /**
     * The reference instance of <code>game.spells</code>
     */
    public static final Spells SPELLS = new Spells();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpellsRecord> getRecordType() {
        return SpellsRecord.class;
    }

    /**
     * The column <code>game.spells.id</code>.
     */
    public final TableField<SpellsRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>game.spells.spell</code>.
     */
    public final TableField<SpellsRecord, Short> SPELL = createField("spell", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>game.spells.level</code>.
     */
    public final TableField<SpellsRecord, Byte> LEVEL = createField("level", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>game.spells.position</code>.
     */
    public final TableField<SpellsRecord, Byte> POSITION = createField("position", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>game.spells.owner</code>.
     */
    public final TableField<SpellsRecord, Integer> OWNER = createField("owner", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>game.spells</code> table reference
     */
    public Spells() {
        this("spells", null);
    }

    /**
     * Create an aliased <code>game.spells</code> table reference
     */
    public Spells(String alias) {
        this(alias, SPELLS);
    }

    private Spells(String alias, Table<SpellsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Spells(String alias, Table<SpellsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Game.GAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Spells as(String alias) {
        return new Spells(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Spells rename(String name) {
        return new Spells(name, null);
    }
}
