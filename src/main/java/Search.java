import domain.Drink;
import domain.DrinkRepository;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Search {

    public static void search(DrinkRepository drinkRepository) {
        Scanner scan = new Scanner(System.in);


        String input = "";
        while (input.length() < 3) {
            System.out.println("Specify search string");
            input = scan.nextLine();

            if (input.length() >= 3) {
                String finalInput = input;
                List<Drink> filteredDrinks = drinkRepository.getDrinks()
                        .stream()
                        .filter(a -> a.getDrinkName().toLowerCase().contains(finalInput.toLowerCase()))
                        .collect(Collectors.toList());

                System.out.println();
                if (filteredDrinks.size() == 0) {
                    System.out.println("No items found");
                } else {
                    System.out.println("Found times are");
                    for (Drink drink : filteredDrinks) {
                        System.out.println(drink);
                    }
                }
            } else {
                System.out.println("Too short search input");
            }
        };

    }

}
