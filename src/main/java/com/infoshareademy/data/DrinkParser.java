package data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infoshareademy.data.DrinkDAO;
import com.infoshareademy.domain.Drink;
import com.infoshareademy.domain.DrinkRepository;
import com.infoshareademy.domain.Ingredient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DrinkParser {

    public DrinkRepository readFileIntoDrinkRepository() {
        ObjectMapper objectMapper = new ObjectMapper();

        Path path = Paths.get("src", "main", "resources", "mDrinks.json");

        try {
            File file = path.toFile();
            DrinkDaoRepository drinks = objectMapper.readValue(file, DrinkDaoRepository.class);
            List<Drink> drinkList = createListOfDrinks(drinks);

            return new DrinkRepository(drinkList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static List<Drink> createListOfDrinks(DrinkDaoRepository drinks) {
        List<Drink> drinkList = new ArrayList<>();
        for (DrinkDAO drink : drinks.getDrinks()) {

            List<Ingredient> ingredients = new ArrayList<>();
            ingredients.add(new Ingredient(drink.getStrIngredient1(), drink.getStrMeasure1()));
            ingredients.add(new Ingredient(drink.getStrIngredient2(), drink.getStrMeasure2()));
            ingredients.add(new Ingredient(drink.getStrIngredient3(), drink.getStrMeasure3()));
            ingredients.add(new Ingredient(drink.getStrIngredient4(), drink.getStrMeasure4()));
            ingredients.add(new Ingredient(drink.getStrIngredient5(), drink.getStrMeasure5()));

            drinkList.add(new Drink(
                            drink.getIdDrink(),
                            drink.getStrDrink(),
                            drink.getStrCategory(),
                            drink.getStrGlass(),
                            drink.getStrInstructions(),
                            ingredients,
                            drink.getTypeAlcohol()
                    )
            );
        }
        return drinkList;
    }

    public static class DrinkDaoRepository {
        private List<DrinkDAO> drinks = new ArrayList<>();

        public DrinkDaoRepository() {
        }

        public List<DrinkDAO> getDrinks() {
            return drinks;
        }
    }
    public DrinkRepository readNewDataBase() {
        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Paths.get("src", "main", "resources", "mDrinkstest.json");
        try {
            File file = path.toFile();
            DrinkRepository listOfDrinks = objectMapper.readValue(file, DrinkRepository.class);
            List<Drink> drinkList = listOfDrinks.getDrinks();
            return new DrinkRepository(drinkList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
