import com.fasterxml.jackson.databind.ObjectMapper;
import data.DrinkParser;
import domain.Drink;
import domain.DrinkRepository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");

        System.out.println("Reading of drinks from json in DrinksRepository");
//        DrinkParser drinkParser = new DrinkParser();
//        DrinkRepository drinkRepository = drinkParser.readFileIntoDrinkRepository();
//
//        for (Drink drink : drinkRepository.getDrinks()) {
//            System.out.println(drink);
//        }
        AddDrink.addDrink();
       // AddDrink.addToDataBase();

//        ObjectMapper objectMapper = new ObjectMapper();
//        //serializacja
//        String objectAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(drinkRepository.getDrinks());
//        System.out.println(objectAsString);
//
//        Path creatNewJson = Paths.get("src", "main", "resources", "mDrinkstest.json");
//        File jsonNew = creatNewJson.toFile();
//        Files.write(new File(String.valueOf(jsonNew)).toPath(), Arrays.asList(objectAsString), StandardOpenOption.APPEND);



    }

}
