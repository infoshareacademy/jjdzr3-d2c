package com.infoshareademy.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Category {
    COFFEE_OR_TEA("Coffee / Tea"),
    COCKTAIL("Cocktail"),
    ORDINARY_DRINK("Ordinary Drink"),
    PARTY_DRINK_OR_PUNCH("Punch / Party Drink"),
    SHOT("Shot"),
    OTHER ("Other/Unknown"),
    MILK_FLOTAT_SHAKE("Milk / Float / Shake"),
    BEER ("Beer"),
    SOFT_DRINK_OR_SODA("Soft Drink / Soda"),
    LIQUEUR("Liqueur");


    private final String label;

    Category(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
