import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import data.DrinkParser;
import domain.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public abstract class AddDrink {

    public static void addDrink() throws IOException {


        Drink drink = new Drink();

        System.out.println("How many drinks you want to add? :");
        Integer numberDrinkToAdd = new Scanner(System.in).nextInt();
        for (int j = 1; j <= numberDrinkToAdd; j++) {

            System.out.println("Enter drink id");
            Integer addedID = new Scanner(System.in).nextInt();
            drink.setDrinkId(addedID);

            System.out.println("Enter drink name");
            String addedName = new Scanner(System.in).nextLine();
            drink.setDrinkName(addedName);

            System.out.println("Enter category: 1 - " + Category.PARTY_DRINK_OR_PUNCH + "; 2- " + Category.ORDINARY_DRINK + "; 3 - " + Category.COCKTAIL + "; 4 - " + Category.COFFEE_OR_TEA +
                    "; 5 - " + Category.SHOT);
            Integer number = new Scanner(System.in).nextInt();
            if (number == 1) {
                drink.setDrinkCategory(Category.PARTY_DRINK_OR_PUNCH);
            } else if (number == 2) {
                drink.setDrinkCategory(Category.ORDINARY_DRINK);
            } else if (number == 3) {
                drink.setDrinkCategory(Category.COCKTAIL);
            } else if (number == 4) {
                drink.setDrinkCategory(Category.COFFEE_OR_TEA);
            } else if (number == 5) {
                drink.setDrinkCategory(Category.SHOT);
            }

            System.out.println("Enter type of drink glass: 1 - " + GlassType.PINT_GLASS + "; 2 -" + GlassType.COCKTAIL + "; 3 -" + GlassType.CHAMPAGNE_FLUTE + "; 4 -" + GlassType.SHOT +
                    "; 5 -" + GlassType.COFFEE_MUG + "; 6 -" + GlassType.PUNCH + "; 7 -" + GlassType.COLLINS + "; 8 -" + GlassType.COPPER_MUG + "; 9 -" + GlassType.HIGHBALL + "; 10 -" + GlassType.IRISH_COFFEE_CUP +
                    "; 11 -" + GlassType.OLD_FASHIONED);
            Integer choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                drink.setGlassType(GlassType.PINT_GLASS);
            } else if (choice == 2) {
                drink.setGlassType(GlassType.COCKTAIL);
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
            for (int i = 1; i <= numberOfIngredient; i++) {
                System.out.println("Enter " + i + " ingredient ");
                String addedIngredients = new Scanner(System.in).nextLine();
                System.out.println("Enter " + i + " measure");
                String addedMeasure = new Scanner(System.in).nextLine();
                Ingredient a = new Ingredient(addedIngredients, addedMeasure);
                ingredients.add(a);
                drink.setIngredients(ingredients);
            }

            System.out.println("Enter type of an alcohol: 1 - " + Type.ALKOHOL_FREE + " 2 -" + Type.ALKOHOL);
            Integer choice1 = new Scanner(System.in).nextInt();
            if (choice1 == 1) {
                drink.setDrinkType(Type.ALKOHOL);
            } else if (choice1 == 2) {
                drink.setDrinkType(Type.ALKOHOL_FREE);
            }

            DrinkParser drinkParser = new DrinkParser();
            DrinkRepository drinkRepository = drinkParser.readFileIntoDrinkRepository();




            //parsing to json file, add object to file
            Path path = Paths.get("src", "main", "resources", "mDrinkstest.json");
            ObjectMapper objectMapper = new ObjectMapper();
            String objectAsString = null;
            try {
                objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(drink);
                Files.write(new File(String.valueOf(path)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            System.out.println(objectAsString);




        }


        }
    }

