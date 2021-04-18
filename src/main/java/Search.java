import domain.Drink;
import domain.DrinkRepository;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Search {

    public static void search(DrinkRepository drinkRepository) {
        Scanner scan = new Scanner(System.in);
        String input = "";

        while (input.length() < 3) {
            System.out.println("Specify search string");
            input = scan.nextLine();

            if (input.trim().length() >= 3) {
                searchItemsForQuery(drinkRepository, input);
            } else {
                System.out.println("Too short search criteria input");
            }
        }

    }

    private static void searchItemsForQuery(DrinkRepository drinkRepository, String input) {
        List<Drink> filteredDrinks = drinkRepository.getDrinks()
                .stream()
                .filter(a -> a.getDrinkName().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList());

        if (filteredDrinks.size() == 0) {
            System.out.println("No items found for given search criteria");
        } else {
            printOutFoundItems(filteredDrinks);
        }
    }

    private static void printOutFoundItems(List<Drink> filteredDrinks) {
        System.out.println("Items matching search criteria are: ");
        for (Drink drink : filteredDrinks) {
            System.out.println(drink);
        }
    }

}
