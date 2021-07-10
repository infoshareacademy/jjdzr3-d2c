package com.infoshareademy.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GlassType {
    COCKTAIL("Cocktail glass"),
    SHOT("Shot glass"),
    OLD_FASHIONED("Old-fashioned glass"),
    COLLINS("Collins glass"),
    HIGHBALL("Highball glass"),
    IRISH_COFFEE_CUP("Irish coffee cup"),
    COPPER_MUG("Copper Mug"),
    COFFEE_MUG("Coffee Mug"),
    /*COFFEE_MUG_1("Coffee mug"),*/
    PUNCH("Punch bowl"),
    PINT_GLASS("Pint glass"),
    CHAMPAGNE_FLUTE("Champagne flute"),
    MARTINI_GLASS ("Martini Glass");


    private final String label;

    GlassType(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }
}
