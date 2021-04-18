import data.DrinkParser;
import domain.Drink;
import domain.DrinkRepository;
import domain.GlassType;
import domain.Type;

import java.util.*;
import java.util.stream.Collectors;

public class Filtr {

// Lista wszystkich [elementów] filtrowana per właściwości
    //Wcześniej wykonana lista wszystkich elementów powinna zyskać filtry. Możliwość ograniczania wyników względem kategorii lub właściwości.
public  List<Drink> Filtr(List<Drink> drinks) {
    boolean filtrsWhile = true;

    System.out.println("Wybierz Filtr: ");
    System.out.println("T1 - Non alcoholic \\\\ T2 - Alcoholic");
    System.out.println("GT1 - Cocktail glass \\\\ GT2 - Shot glass");
    System.out.println("Filtr by Letter = ");
do {





    Scanner scanner = new Scanner(System.in);
    String chose = scanner.next();
    switch (chose) {
        case "T1":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkType() == Type.ALKOHOL_FREE)
                    .collect(Collectors.toList());
            // .forEach(System.out::println)
            break;
        case "T2":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkType() == Type.ALKOHOL)
                    .collect(Collectors.toList());
            break;
        case "GT1":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.COCKTAIL)
                    .collect(Collectors.toList());
            break;
        case "GT2":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.SHOT)
                    .collect(Collectors.toList());
            break;

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

    System.out.println("Chcesz dodać kolejny Filtr? Y/N?");
    scanner = new Scanner(System.in);
    chose = scanner.next();
    if (chose.equals("Y")){
        filtrsWhile=true;
        System.out.print("Który Filtr?: ");
    } else {
        filtrsWhile=false;
    }

} while (filtrsWhile);
    return drinks;
}







}
