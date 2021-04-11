import domain.Category;
import domain.GlassType;
import domain.Ingredient;
import domain.Type;
import menu.MenuEng;
import menu.MenuPL;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Filtr {

// Lista wszystkich [elementów] filtrowana per właściwości
public static void main(String[] args) {

    Map<Integer, String> menuMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    int chose = scanner.nextInt();
    switch (chose) {
        case 1:
            MenuEng menuEng = new MenuEng();
            menuMap.get(40);
            menuMap.get(31);    // drinkId;
            menuMap.get(32);    // drinkName;
            menuMap.get(33);
            menuMap.get(34);
            menuMap.get(35);
            menuMap.get(36);
            menuMap.get(36);
            menuMap.get(03);

            private Integer drinkId;
            private String drinkName;
            private Category drinkCategory;
            private GlassType glassType;
            private String preparationInstruction;
            private List<Ingredient> ingredients;
            private Type drinkType;

            break;
        case 2:
            MenuPL menuPL = new MenuPL();

            break;


    }
}







}
