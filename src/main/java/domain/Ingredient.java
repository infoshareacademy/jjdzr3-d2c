package domain;

public class Ingredient {
    private String ingredientName;
    private String measure;

    public Ingredient(){
        super();
    }

    public Ingredient(String ingredientName, String measure) {
        this.ingredientName = ingredientName;
        this.measure = measure;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "ingredientName: " + this.getIngredientName() + ", " +
               "measure: " + this.getMeasure();
    }
}
