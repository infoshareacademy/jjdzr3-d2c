package drink;


import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    ALKOHOL("Non alcoholic"),
    ALKOHOL_FREE("Alcoholic");

    private final String label;

    Type(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

}
