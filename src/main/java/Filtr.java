import data.DrinkParser;
import domain.Drink;
import domain.DrinkRepository;
import domain.Type;

import java.util.*;

public class Filtr {

// Lista wszystkich [elementów] filtrowana per właściwości
    //Wcześniej wykonana lista wszystkich elementów powinna zyskać filtry. Możliwość ograniczania wyników względem kategorii lub właściwości.
public static void main(String[] args) {
    Map<Integer, String> menuMap = new HashMap<>();
    DrinkParser drinkParser = new DrinkParser();

    DrinkRepository drinkRepository = drinkParser.readFileIntoDrinkRepository();
    List<Drink> drinks = drinkParser.readFileIntoDrinkRepository().getDrinks();




    System.out.println("Wybierz Filtr: ");
    System.out.println("T1 - Non alcoholic");
    System.out.println("T2 - Alcoholic");



    Scanner scanner = new Scanner(System.in);
    String chose = scanner.next();
    switch (chose) {
        case "T1":
            drinks.stream()
                    .filter(drink -> drink.getDrinkType() == Type.ALKOHOL)

                    .forEach(System.out::println);
                    break;
        case "T2":
            drinks.stream()
            .filter(drink -> drink.getDrinkType() == Type.ALKOHOL_FREE)
            .forEach(System.out::println);
            break;




        }


/*
            private Integer drinkId;
            private String drinkName;
            private Category drinkCategory;
            private GlassType glassType;
            private String preparationInstruction;
            private List<Ingredient> ingredients;
            private Type drinkType;
*/



}







}
