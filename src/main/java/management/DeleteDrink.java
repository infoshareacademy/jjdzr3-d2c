package management;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareademy.data.DrinkParser;
import com.infoshareademy.domain.Drink;
import com.infoshareademy.domain.DrinkRepository;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.IOException;
import java.util.stream.Collectors;

public class DeleteDrink {
    public static void searchNameAndDelete() throws IOException {

        DrinkParser drinkParser = new DrinkParser();
        DrinkRepository drinkRepository1 = drinkParser.readNewDataBase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter drink name to remove:");
        String input = scanner.nextLine();
        List<Drink> filteredDrinks = drinkRepository1.getDrinks()
                .stream()
                .filter(a -> a.getDrinkName().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList());
        if (filteredDrinks.size() == 0) {
            System.out.println("No items found for given search criteria");
        } else {
            System.out.println(filteredDrinks);
            System.out.println("Are you sure you want to remove selected drinks? - Y/N");
            Scanner decisionScanner = new Scanner(System.in);
            String decision = decisionScanner.nextLine().toUpperCase();
            if (decision == "Y") {
                for (Drink i : filteredDrinks) {
                    drinkRepository1.getDrinks().remove(i);
                }
                System.out.println(drinkRepository1.getDrinks());
                ObjectMapper objectMapper = new ObjectMapper();
                Path creatNewJson = Paths.get("src", "main", "resources", "mDrinkstest.json");
                File jsonListaDrinkow = creatNewJson.toFile();
                List<Drink> listOfDrinks = drinkRepository1.getDrinks();
                jsonListaDrinkow.delete();
                jsonListaDrinkow.createNewFile();
                String objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new DrinkRepository((List<Drink>) listOfDrinks));
                Files.write(new File(String.valueOf(jsonListaDrinkow)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);
            } else if (decision != "Y") {
                System.out.println("Operation aboart");
            }
        }
    }
}
