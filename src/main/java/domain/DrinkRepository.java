package domain;

import java.util.List;

public class DrinkRepository {

    private List<Drink> drinks;

    public DrinkRepository(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

}
