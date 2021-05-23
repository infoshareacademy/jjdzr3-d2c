package com.infoshareademy.domain;

import java.util.ArrayList;
import java.util.List;



public class DrinkRepository {
    public DrinkRepository() {
    }
    private List<Drink> drinks = new ArrayList<>() ;
    public DrinkRepository(List<Drink> drinks) {
        this.drinks = drinks;
    }
    public List<Drink> getDrinks() {
        return drinks;
    }
    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }
}
