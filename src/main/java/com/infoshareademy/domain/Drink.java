package com.infoshareademy.domain;
import java.util.List;

public class Drink{
    private Integer drinkId;
    private String drinkName;
    private Category drinkCategory;
    private GlassType glassType;
    private String preparationInstruction;
    private List<Ingredient> ingredients;
    private Type drinkType;

    public Drink() {
    }

    public Drink(Integer drinkId, String drinkName, Category drinkCategory, GlassType glassType, String preparationInstruction, List<Ingredient> ingredients, Type drinkType) {
        this.drinkId = drinkId;
        this.drinkName = drinkName;
        this.drinkCategory = drinkCategory;
        this.glassType = glassType;
        this.preparationInstruction = preparationInstruction;
        this.ingredients = ingredients;
        this.drinkType = drinkType;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkId=" + drinkId +
                ", drinkName='" + drinkName + '\'' +
                ", drinkCategory=" + drinkCategory +
                ", glassType=" + glassType +
                ", preparationInstruction='" + preparationInstruction + '\'' +
                ", ingredients=" + ingredients +
                ", drinkType=" + drinkType +
                '}';
    }

    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public Category getDrinkCategory() {
        return drinkCategory;
    }

    public void setDrinkCategory(Category drinkCategory) {
        this.drinkCategory = drinkCategory;
    }

    public GlassType getGlassType() {
        return glassType;
    }

    public void setGlassType(GlassType glassType) {
        this.glassType = glassType;
    }

    public String getPreparationInstruction() {
        return preparationInstruction;
    }

    public void setPreparationInstruction(String preparationInstruction) {
        this.preparationInstruction = preparationInstruction;
    }

    public Type getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(Type drinkType) {
        this.drinkType = drinkType;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

}