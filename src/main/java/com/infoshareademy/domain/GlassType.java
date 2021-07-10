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
    MARTINI_GLASS ("Martini Glass"),
    WHISKEY_SOUR_GLASS("Whiskey sour glass"),
    WHISKEY_GLASS("Whiskey Glass"),
    BEER ("Beer"),
    WINE_GLASS("Wine Glass"),
    HURRICANE_GLASS("Hurricane glass"),
    MASON_JAR("Mason jar"),
    BALLOON_GLASS("Balloon Glass"),
    PITCHER("Pitcher"),
    COUPE_GLASS("Coupe Glass"),
    CORDIAL_GLASS("Cordial glass"),
    NICK_AND_NORA_GLASS("Nick and Nora Glass"),
    BRANDY_SNIFTER("Brandy snifter"),
    MARGARITA_GLASS ("Margarita glass");
    private final String label;

    GlassType(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }
}
