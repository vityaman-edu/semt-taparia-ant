/*
 * This file is generated by jOOQ.
 */
package ru.vityaman.itmo.web.lab.taparia.storage.jooq.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import ru.vityaman.itmo.web.lab.taparia.storage.jooq.Taparia;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TapResultStatus implements EnumType {

    HIT("HIT"),

    MISS("MISS");

    private final String literal;

    private TapResultStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Taparia.TAPARIA;
    }

    @Override
    public String getName() {
        return "tap_result_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static TapResultStatus lookupLiteral(String literal) {
        return EnumType.lookupLiteral(TapResultStatus.class, literal);
    }
}
