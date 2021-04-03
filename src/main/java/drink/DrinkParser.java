package drink;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DrinkParser {

    public DrinkRepository readFileIntoListOfDrinks() {
        ObjectMapper objectMapper=new ObjectMapper();
        File file = new File("src/main/resources", "mDrinks.json");

        try {
            DrinkRepository drinks = objectMapper.readValue(file, DrinkRepository.class);
            for (Drink drink : drinks.getDrinks()) {
                System.out.println(drink);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
