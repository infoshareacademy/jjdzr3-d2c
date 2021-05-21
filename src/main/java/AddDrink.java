import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import data.DrinkParser;
import domain.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static domain.Category.ORDINARY_DRINK;
import static domain.GlassType.COCKTAIL;
import static domain.Type.ALKOHOL_FREE;

public class AddDrink {

    public static Drink addDrink() throws IOException {
        Drink drink = new Drink();

        System.out.println("Add your drink:");
        System.out.println("Enter drink id");
        Integer addedID = new Scanner(System.in).nextInt();
        drink.setDrinkId(addedID);

        System.out.println("Enter drink name");
        String addedName = new Scanner(System.in).nextLine();
        drink.setDrinkName(addedName);

        System.out.println("Enter category: 1 - " + Category.PARTY_DRINK_OR_PUNCH + "; 2- " + ORDINARY_DRINK + "; 3 - " + Category.COCKTAIL + "; 4 - " + Category.COFFEE_OR_TEA +
                "; 5 - " + Category.SHOT);
        Integer number = new Scanner(System.in).nextInt();
        if (number == 1) {
            drink.setDrinkCategory(Category.PARTY_DRINK_OR_PUNCH);
        } else if (number == 2) {
            drink.setDrinkCategory(ORDINARY_DRINK);
        } else if (number == 3) {
            drink.setDrinkCategory(Category.COCKTAIL);
        } else if (number == 4) {
            drink.setDrinkCategory(Category.COFFEE_OR_TEA);
        } else if (number == 5) {
            drink.setDrinkCategory(Category.SHOT);
        }

        System.out.println("Enter type of drink glass: 1 - " + GlassType.PINT_GLASS + "; 2 -" + COCKTAIL + "; 3 -" + GlassType.CHAMPAGNE_FLUTE + "; 4 -" + GlassType.SHOT +
                "; 5 -" + GlassType.COFFEE_MUG + "; 6 -" + GlassType.PUNCH + "; 7 -" + GlassType.COLLINS + "; 8 -" + GlassType.COPPER_MUG + "; 9 -" + GlassType.HIGHBALL + "; 10 -" + GlassType.IRISH_COFFEE_CUP +
                "; 11 -" + GlassType.OLD_FASHIONED);
        Integer choice = new Scanner(System.in).nextInt();
        if (choice == 1) {
            drink.setGlassType(GlassType.PINT_GLASS);
        } else if (choice == 2) {
            drink.setGlassType(COCKTAIL);
        } else if (choice == 3) {
            drink.setGlassType(GlassType.CHAMPAGNE_FLUTE);
        } else if (choice == 4) {
            drink.setGlassType(GlassType.SHOT);
        } else if (choice == 5) {
            drink.setGlassType(GlassType.COFFEE_MUG);
        } else if (choice == 6) {
            drink.setGlassType(GlassType.PUNCH);
        } else if (choice == 7) {
            drink.setGlassType(GlassType.COLLINS);
        } else if (choice == 8) {
            drink.setGlassType(GlassType.COPPER_MUG);
        } else if (choice == 9) {
            drink.setGlassType(GlassType.HIGHBALL);
        } else if (choice == 10) {
            drink.setGlassType(GlassType.IRISH_COFFEE_CUP);
        } else if (choice == 11) {
            drink.setGlassType(GlassType.OLD_FASHIONED);
        }

        System.out.println("Enter instruction");
        String addedInstructions = new Scanner(System.in).nextLine();
        drink.setPreparationInstruction(addedInstructions);

        // Ingredient ingredient= new Ingredient();
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        System.out.println("How many ingredients? 1-5");
        Integer numberOfIngredient = new Scanner(System.in).nextInt();

        if (numberOfIngredient == 5) {
            for (int i = 1; i <= numberOfIngredient; i++) {
                System.out.println("Enter " + i + " ingredient ");
                String addedIngredients = new Scanner(System.in).nextLine();
                System.out.println("Enter " + i + " measure");
                String addedMeasure = new Scanner(System.in).nextLine();
                Ingredient a = new Ingredient(addedIngredients, addedMeasure);
                ingredients.add(a);
                drink.setIngredients(ingredients);
            }
        } else if (numberOfIngredient < 5) {
            for (int i = 1; i <= numberOfIngredient; i++) {
                System.out.println("Enter " + i + " ingredient ");
                String addedIngredients = new Scanner(System.in).nextLine();
                System.out.println("Enter " + i + " measure");
                String addedMeasure = new Scanner(System.in).nextLine();
                Ingredient a = new Ingredient(addedIngredients, addedMeasure);
                ingredients.add(a);
                drink.setIngredients(ingredients);
            }
            for (int j = numberOfIngredient + 1; j <= 5; j++) {
                String addedIngredients = null;
                String addedMeasure = null;
                Ingredient b = new Ingredient(addedIngredients, addedMeasure);
                ingredients.add(b);
                drink.setIngredients(ingredients);
            }

        }

        System.out.println("Enter type of an alcohol: 1 - " + ALKOHOL_FREE + " 2 -" + Type.ALKOHOL);
        Integer choice1 = new Scanner(System.in).nextInt();
        if (choice1 == 1) {
            drink.setDrinkType(Type.ALKOHOL);
        } else if (choice1 == 2) {
            drink.setDrinkType(ALKOHOL_FREE);
        }

        //dodawanie drinka
        Path creatNewJson = Paths.get("src", "main", "resources", "mDrinkstest.json");
        File jsonListaDrinkow = creatNewJson.toFile();
        //jeśli plik jest niepusty
        if (jsonListaDrinkow.length() > 0) {
            System.out.println("pusty plik?");
            ObjectMapper objectMapper = new ObjectMapper();
            DrinkParser drinkParserWithAddedDrink = new DrinkParser();
            List<Drink> drinkRepositoryWithAddedDrink = drinkParserWithAddedDrink.readNewDataBase().getDrinks();
            jsonListaDrinkow.delete();
            jsonListaDrinkow.createNewFile();
            drinkRepositoryWithAddedDrink.add(drink);
            System.out.println(drinkRepositoryWithAddedDrink);
            String objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new DrinkRepository((List<Drink>) drinkRepositoryWithAddedDrink));
            Files.write(new File(String.valueOf(jsonListaDrinkow)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);

        } else {
            DrinkParser drinkParser = new DrinkParser();
            List<Drink> drinkRepository = drinkParser.readFileIntoDrinkRepository().getDrinks();
            drinkRepository.add(drink);
            ObjectMapper objectMapper = new ObjectMapper();
            String objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(new DrinkRepository((List<Drink>) drinkRepository));
            Files.write(new File(String.valueOf(jsonListaDrinkow)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);
        }

        return drink;
    }
}





