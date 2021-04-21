import data.DrinkParser;
import domain.*;

import java.util.*;
import java.util.stream.Collectors;

public class Filtr {

// Lista wszystkich [elementów] filtrowana per właściwości
    //Wcześniej wykonana lista wszystkich elementów powinna zyskać filtry. Możliwość ograniczania wyników względem kategorii lub właściwości.
public  List<Drink> Filtr(List<Drink> drinks) {
    boolean filtrsWhile = true;
    System.out.println("T1 - Non alcoholic \\\\ T2 - Alcoholic");
    System.out.println("C1 -Coffee / Tea \\\\ C2 - Cocktail \\\\ C3 - Ordinary Drink \\\\ C4 - Punch / Party Drink \\\\ C5 - Shot ");
    System.out.println("GT01 - Cocktail glass \\\\ GT02 - Shot glass \\\\ GT03 - Old-fashioned glass \\\\ GT04 - Collins glass \\\\ GT05 - Highball glass");
    System.out.println("GT06 - Irish coffee cup \\\\ GT07 - Copper Mug \\\\ GT08 - Coffee Mug \\\\ GT09 - Punch bowl \\\\  GT10 - Pint glass\\\\ GT11 - Champagne flute ");

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
        case "GT01":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.COCKTAIL)
                    .collect(Collectors.toList());
            break;
        case "GT02":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.SHOT)
                    .collect(Collectors.toList());
            break;
        case "GT03":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.OLD_FASHIONED)
                    .collect(Collectors.toList());
            break;
        case "GT04":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.COLLINS)
                    .collect(Collectors.toList());
            break;
        case "GT05":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.HIGHBALL)
                    .collect(Collectors.toList());
            break;
        case "GT06":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.IRISH_COFFEE_CUP)
                    .collect(Collectors.toList());
            break;
        case "GT07":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.COPPER_MUG)
                    .collect(Collectors.toList());
            break;
        case "GT08":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.COFFEE_MUG)
                    .collect(Collectors.toList());
            break;
        case "GT09":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.PUNCH)
                    .collect(Collectors.toList());
            break;
        case "GT10":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.PINT_GLASS)
                    .collect(Collectors.toList());
            break;
        case "GT11":
            drinks = drinks.stream()
                    .filter(drink -> drink.getGlassType() == GlassType.CHAMPAGNE_FLUTE)
                    .collect(Collectors.toList());
            break;
        case "C1":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkCategory() == Category.COFFEE_OR_TEA)
                    .collect(Collectors.toList());
            break;
        case "C2":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkCategory() == Category.COCKTAIL)
                    .collect(Collectors.toList());
            break;
        case "C3":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkCategory() == Category.ORDINARY_DRINK)
                    .collect(Collectors.toList());
            break;
        case "C4":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkCategory() == Category.PARTY_DRINK_OR_PUNCH)
                    .collect(Collectors.toList());
            break;
        case "C5":
            drinks = drinks.stream()
                    .filter(drink -> drink.getDrinkCategory() == Category.SHOT)
                    .collect(Collectors.toList());
            break;
    }
    System.out.println("Chcesz dodać kolejny Filtr? Y/N?");
    scanner = new Scanner(System.in);
    chose = scanner.next();
    if (chose.equals("Y") || chose.equals("T")){
        filtrsWhile=true;
        System.out.print("Który Filtr?: ");
    } else {
        filtrsWhile=false;
    }
} while (filtrsWhile);
    return drinks;
}

}
