package domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Category {
    COFFEE_OR_TEA("Coffee / Tea"),
    COCKTAIL("Cocktail"),
    ORDINARY_DRINK("Ordinary Drink"),
    PARTY_DRINK_OR_PUNCH("Punch / Party Drink"),
    SHOT("Shot");

    private final String label;

    Category(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

    }
