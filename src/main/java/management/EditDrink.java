package management;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareademy.domain.*;
import data.DrinkParser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;

public class EditDrink {
    public static Drink drinkEdition() throws IOException {
        Drink drink = new Drink();
        DrinkParser drinkParser = new DrinkParser();
        DrinkRepository drinkRepository1 = drinkParser.readNewDataBase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter drink name to change:");
        String input = scanner.nextLine();
        List<Drink> filteredDrinks = drinkRepository1.getDrinks()
                .stream()
                .filter(a -> a.getDrinkName().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList());
        Drink drink1 = filteredDrinks.get(0);
        System.out.println(drink1);
        System.out.println("----------------------------------");

        System.out.println("What argument would you like to change?: name, category, glass, instruction, recipe");
        Scanner skanerForDecision = new Scanner(System.in);
        Scanner scanner2 = new Scanner((System.in));
        String atributToChange = skanerForDecision.nextLine().toLowerCase();

        if (atributToChange.equals("name")) {
            System.out.println("Add new name:");
            String newValue = scanner2.nextLine();
            drink1.setDrinkName(newValue);
            System.out.println(drink1);
        } else if (atributToChange.equals("instruction")) {
            System.out.println("Add new instruction");
            String newValue = scanner2.nextLine();
            drink1.setPreparationInstruction(newValue);
            System.out.println(drink1);
        } else if (atributToChange.equals("category")) {
            System.out.println("Enter category: 1 - " + Category.PARTY_DRINK_OR_PUNCH + "; 2- " + Category.ORDINARY_DRINK + "; 3 - " + Category.COCKTAIL + "; 4 - " + Category.COFFEE_OR_TEA +
                    "; 5 - " + Category.SHOT);
            Integer number = new Scanner(System.in).nextInt();
            if (number == 1) {
                drink1.setDrinkCategory(Category.PARTY_DRINK_OR_PUNCH);
            } else if (number == 2) {
                drink1.setDrinkCategory(Category.ORDINARY_DRINK);
            } else if (number == 3) {
                drink1.setDrinkCategory(Category.COCKTAIL);
            } else if (number == 4) {
                drink1.setDrinkCategory(Category.COFFEE_OR_TEA);
            } else if (number == 5) {
                drink1.setDrinkCategory(Category.SHOT);
            }
            System.out.println(drink1);
        } else if (atributToChange.equals("glass")) {
            System.out.println("Enter type of drink glass: 1 - " + GlassType.PINT_GLASS + "; 2 -" + GlassType.COCKTAIL + "; 3 -" + GlassType.CHAMPAGNE_FLUTE + "; 4 -" + GlassType.SHOT +
                    "; 5 -" + GlassType.COFFEE_MUG + "; 6 -" + GlassType.PUNCH + "; 7 -" + GlassType.COLLINS + "; 8 -" + GlassType.COPPER_MUG + "; 9 -" + GlassType.HIGHBALL + "; 10 -" + GlassType.IRISH_COFFEE_CUP +
                    "; 11 -" + GlassType.OLD_FASHIONED);
            Integer choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                drink1.setGlassType(GlassType.PINT_GLASS);
            } else if (choice == 2) {
                drink1.setGlassType(GlassType.COCKTAIL);
            } else if (choice == 3) {
                drink1.setGlassType(GlassType.CHAMPAGNE_FLUTE);
            } else if (choice == 4) {
                drink1.setGlassType(GlassType.SHOT);
            } else if (choice == 5) {
                drink1.setGlassType(GlassType.COFFEE_MUG);
            } else if (choice == 6) {
                drink1.setGlassType(GlassType.PUNCH);
            } else if (choice == 7) {
                drink1.setGlassType(GlassType.COLLINS);
            } else if (choice == 8) {
                drink1.setGlassType(GlassType.COPPER_MUG);
            } else if (choice == 9) {
                drink1.setGlassType(GlassType.HIGHBALL);
            } else if (choice == 10) {
                drink1.setGlassType(GlassType.IRISH_COFFEE_CUP);
            } else if (choice == 11) {
                drink1.setGlassType(GlassType.OLD_FASHIONED);
            }
            System.out.println(drink1);
        } else if (atributToChange.equals("recipe")) {
            List<Ingredient> ingredients = new ArrayList<Ingredient>();
            System.out.println("How many ingredients do you want to change? 1-5");
            Integer numberOfIngredient = new Scanner(System.in).nextInt();

            if (numberOfIngredient == 5) {
                for (int i = 1; i <= numberOfIngredient; i++) {
                    System.out.println("Enter " + i + " ingredient ");
                    String addedIngredients = new Scanner(System.in).nextLine();
                    System.out.println("Enter " + i + " measure");
                    String addedMeasure = new Scanner(System.in).nextLine();
                    Ingredient a = new Ingredient(addedIngredients, addedMeasure);
                    ingredients.add(a);
                    drink1.setIngredients(ingredients);
                }
            } else if (numberOfIngredient < 5) {
                for (int i = 1; i <= numberOfIngredient; i++) {
                    System.out.println("Enter " + i + " ingredient ");
                    String addedIngredients = new Scanner(System.in).nextLine();
                    System.out.println("Enter " + i + " measure");
                    String addedMeasure = new Scanner(System.in).nextLine();
                    Ingredient a = new Ingredient(addedIngredients, addedMeasure);
                    ingredients.add(a);
                    drink1.setIngredients(ingredients);
                }
                for (int j = numberOfIngredient + 1; j <= 5; j++) {
                    String addedIngredients = null;
                    String addedMeasure = null;
                    Ingredient b = new Ingredient(addedIngredients, addedMeasure);
                    ingredients.add(b);
                    drink1.setIngredients(ingredients);
                }
            }
            System.out.println(drink1);
        } else {
            System.out.println("Nothing was change");
        }
        ObjectMapper objectMapper = new ObjectMapper();
        Path creatNewJson = Paths.get("src", "main", "resources", "mDrinkstest.json");
        File jsonListaDrinkow = creatNewJson.toFile();
        List<Drink> listOfDrinks = drinkRepository1.getDrinks();
        listOfDrinks.add(drink1);
        jsonListaDrinkow.delete();
        jsonListaDrinkow.createNewFile();
        String objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new DrinkRepository((List<Drink>) listOfDrinks));
        Files.write(new File(String.valueOf(jsonListaDrinkow)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);
        return drink1;
    }

    public static DrinkRepository cancelChanges() throws IOException {
        Drink drink = new Drink();
        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Paths.get("src", "main", "resources", "mDrinkstest.json");
        File drinkList = path.toFile();
        List<Drink> drinkRepositoryWithAddedDrink = new DrinkParser().readFileIntoDrinkRepository().getDrinks();
        drinkList.delete();
        drinkList.createNewFile();
        String objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new DrinkRepository((List<Drink>) drinkRepositoryWithAddedDrink));
        Files.write(new File(String.valueOf(path)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);
        return null;
    }
}