package menu;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MenuPL {
    Map<Integer, String> map = new HashMap<>();

    public Map<Integer, String> getMenuPl() {
        this.map.put(01, "Witamy w Menu programie \"Bartender\'s Handybook\"");
        this.map.put(02, "Jest w nim kilka opcji do przetestowania");
        this.map.put(11, "1 - Wyświetl wszystkie Elementy z Bazy");
        this.map.put(12, "2 - Wyświetl pojedyńczy losowy element z Bazy");
        this.map.put(13, "3 - Wyszukaj Drink");
        this.map.put(14, "4 - Filtruj wyświetlone Drinki");
        this.map.put(15, "5 - Zarządzanie elementami");
        this.map.put(16, "6 - Zarządzanie uczestnikami");
        //this.map.put(17, "7 - Miejsce do uzupełnienia");
        //this.map.put(18, "8 - Miejsce do uzupełnienia");
        //this.map.put(19, "9 - Miejsce do uzupełnienia");
        this.map.put(00, "0 - Koniec");
        this.map.put(03, "0 - Poprzednie Menu");

        //this.map.put(13, "3 - Wyszukaj Drink");
        this.map.put(30, "Za pomocą jakiego Filtru chcesz wyszukać:");
        this.map.put(31, "1 - Nazwa");
        this.map.put(32, "2 - Składnik");
        this.map.put(33, "3 - Szklanka");
        this.map.put(34, "4 - Kategoria");
        this.map.put(35, "5 - Alkochol");
        this.map.put(36, "6 - IdDrink");
        this.map.put(40, "Za pomocą jakiego Filtru, chcesz wyświetlić drinki");



        this.map.put(90, "Miała być cyfra");
        this.map.put(91, "Podaj cyfre, a program w końcu zadziała: ");
        this.map.put(92, "Podałeś niewłaściwy argument");
        this.map.put(93, "Program zakończy swoje działanie");


        System.out.println("Walcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");


        return map;
    }
}
