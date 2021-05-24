import com.infoshareademy.Search;
import com.infoshareademy.domain.Drink;
import com.infoshareademy.domain.DrinkRepository;
import data.DrinkParser;


public class Main {

    public static void main(String[] args) {

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

        Search.search(drinkRepository);


    }

}
