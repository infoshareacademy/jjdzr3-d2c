import data.DrinkParser;
import domain.Drink;
import domain.DrinkRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> menuMap = new HashMap<>();
        DrinkParser drinkParser = new DrinkParser();
        DrinkRepository drinkRepository = drinkParser.readFileIntoDrinkRepository();
        List<Drink> drinks = drinkParser.readFileIntoDrinkRepository().getDrinks();

        System.out.println("Welcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");

        System.out.println(drinks);
        System.out.println("Reading of drinks from json in DrinksRepository");






    }

}
