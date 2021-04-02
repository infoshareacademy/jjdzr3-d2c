import com.fasterxml.jackson.databind.ObjectMapper;
import drink.Drink;

import java.io.File;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        System.out.println("Walcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");

        System.out.println("Testowy wynik");
        ObjectMapper objectMapper=new ObjectMapper();
        File file = new File("src", "onedrink.json");

        try {
            Drink drink1 = objectMapper.readValue(file, Drink.class);
            System.out.println(drink1);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
