import data.DrinkParser;
import domain.Drink;
import domain.DrinkRepository;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");

        System.out.println("Reading of drinks from json in DrinksRepository");
        DrinkParser drinkParser = new DrinkParser();
        DrinkRepository drinkRepository = drinkParser.readFileIntoDrinkRepository();

        for(Drink drink : drinkRepository.getDrinks()) {
            System.out.println(drink);
        }
        AddDrink.addDrink();
        Search.search(drinkRepository);


    }

}
