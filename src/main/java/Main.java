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

        Menu menu = new Menu();
       menu.menu(drinkParser, drinkRepository, drinks);





    }

}
