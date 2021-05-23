package com.infoshareademy.data;


import com.infoshareademy.domain.Category;
import com.infoshareademy.domain.GlassType;
import com.infoshareademy.domain.Type;

public class DrinkDAO {
    private Integer idDrink;
    private String strDrink;
    private Category strCategory;
    private GlassType strGlass;
    private String strInstructions;
    private String strIngredient1;
    private String strIngredient2;
    private String strIngredient3;
    private String strIngredient4;
    private String strIngredient5;
    private String strMeasure1;
    private String strMeasure2;
    private String strMeasure3;
    private String strMeasure4;
    private String strMeasure5;
    private Type typeAlcohol;

    public DrinkDAO() {
    }

    public DrinkDAO(Integer idDrink, String strDrink, Category strCategory, GlassType strGlass, String strInstructions, String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4, String strIngredient5, String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5, Type typeAlcohol) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strCategory = strCategory;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strIngredient5 = strIngredient5;
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
        this.strMeasure5 = strMeasure5;
        this.typeAlcohol = typeAlcohol;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "idDrink=" + idDrink +
                ", strDrink='" + strDrink + '\'' +
                ", strCategory='" + strCategory + '\'' +
                ", strGlass='" + strGlass + '\'' +
                ", strInstructions='" + strInstructions + '\'' +
                ", strIngredient1='" + strIngredient1 + '\'' +
                ", strIngredient2='" + strIngredient2 + '\'' +
                ", strIngredient3='" + strIngredient3 + '\'' +
                ", strIngredient4='" + strIngredient4 + '\'' +
                ", strIngredient5='" + strIngredient5 + '\'' +
                ", strMeasure1='" + strMeasure1 + '\'' +
                ", strMeasure2='" + strMeasure2 + '\'' +
                ", strMeasure3='" + strMeasure3 + '\'' +
                ", strMeasure4='" + strMeasure4 + '\'' +
                ", strMeasure5='" + strMeasure5 + '\'' +
                ", typeAlcohol='" + typeAlcohol + '\'' +
                '}';
    }

    public Integer getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(Integer idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public Category getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(Category strCategory) {
        this.strCategory = strCategory;
    }

    public GlassType getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(GlassType strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrMeasure1() {
        return strMeasure1;
    }

    public void setStrMeasure1(String strMeasure1) {
        this.strMeasure1 = strMeasure1;
    }

    public Type getTypeAlcohol() {
        return typeAlcohol;
    }

    public void setTypeAlcohol(Type typeAlcohol) {
        this.typeAlcohol = typeAlcohol;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrMeasure2() {
        return strMeasure2;
    }

    public void setStrMeasure2(String strMeasure2) {
        this.strMeasure2 = strMeasure2;
    }

    public String getStrMeasure3() {
        return strMeasure3;
    }

    public void setStrMeasure3(String strMeasure3) {
        this.strMeasure3 = strMeasure3;
    }

    public String getStrMeasure4() {
        return strMeasure4;
    }

    public void setStrMeasure4(String strMeasure4) {
        this.strMeasure4 = strMeasure4;
    }

    public String getStrMeasure5() {
        return strMeasure5;
    }

    public void setStrMeasure5(String strMeasure5) {
        this.strMeasure5 = strMeasure5;
    }
}