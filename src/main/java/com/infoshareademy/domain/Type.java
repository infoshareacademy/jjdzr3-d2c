package com.infoshareademy.domain;


import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    ALKOHOL_FREE("Non alcoholic"),
    ALKOHOL("Alcoholic");

    private final String label;

    Type(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

}
