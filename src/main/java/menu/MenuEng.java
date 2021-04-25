package menu;

import java.util.HashMap;
import java.util.Map;

public class MenuEng {

    Map<Integer, String> map = new HashMap<>();

    public Map<Integer, String> getMenuEng() {
        this.map.put(01, "Hello in Program: \"Bartender\'s Handybook\"");
        this.map.put(02, "This program have a faw options to test");
        this.map.put(05, "Choose one of them from list: ");
        this.map.put(11, "1 - Show all Drinks from data base");
        this.map.put(12, "2 - Show random Drink from data base");
        this.map.put(13, "3 - Search drink, by name");
        this.map.put(14, "4 - Filters the drink database");
        this.map.put(15, "5 - Management of database elements");
        this.map.put(16, "6 - user management" );
        this.map.put(00, "0 - End");
        this.map.put(40, "Choose Filters to search in drink Database");
        this.map.put(41, "Choose Filters: ");
        this.map.put(20, "Continue search Y/N?");
        this.map.put(90, "Please, enter number");
        this.map.put(91, "Enter number and app will be work properly:");
        this.map.put(92, "Wrong input");
        this.map.put(93, "Program will finish work");
        this.map.put(94, "Do you want run program again?");
        this.map.put(95, "Enter \"1\" if yes");
        this.map.put(30, "Sorry, program doesn't have this filter: ");
        this.map.put(31, "You want to add another filter? Y/N?");
        this.map.put(32, "Which Filter ?:  ");
        this.map.put(33, "No results.");
        return map;
    }

}
