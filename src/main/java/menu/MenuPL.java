package menu;

import java.util.HashMap;
import java.util.Map;

public class MenuPL {

    Map<Integer, String> map = new HashMap<>();

    public Map<Integer, String> getMenuPl() {
        this.map.put(01, "Witamy w Menu programie \"Bartender\'s Handybook\"");
        this.map.put(02, "Jest w nim kilka opcji do przetestowania");
        this.map.put(05, "Wybierz Opcję, którą chcesz uruchomić: ");
        this.map.put(11, "1 - Wyświetl wszystkie Elementy z Bazy");
        this.map.put(12, "2 - Wyświetl losowy element z Bazy");
        this.map.put(13, "3 - Wyszukaj Drink");
        this.map.put(14, "4 - Filtruj wyświetlone Drinki");
        this.map.put(15, "5 - Zarządzanie elementami");
        this.map.put(16, "6 - Zarządzanie uczestnikami");
        //this.map.put(17, "7 - Miejsce do uzupełnienia");
        //this.map.put(18, "8 - Miejsce do uzupełnienia");
        //this.map.put(19, "9 - Miejsce do uzupełnienia");
        this.map.put(00, "0 - Koniec");
        this.map.put(40, "Za pomocą jakiego Filtru, chcesz wyświetlić drinki");
        this.map.put(41, "Wybierz Filtr: ");
        this.map.put(20, "Kontynuować wyszukiwanie Y/N?");
        this.map.put(90, "Miała być cyfra");
        this.map.put(91, "Podaj cyfre, a program w końcu zadziała: ");
        this.map.put(92, "Podałeś niewłaściwy argument");
        this.map.put(93, "Program zakończy swoje działanie");
        this.map.put(94, "Chcesz uruchomić program jeszcze raz?");
        this.map.put(95, "Wpisz \"1\" jeżeli chcesz tak.");
        this.map.put(30, "Przepraszamy, program nie ma tego filtra: ");
        this.map.put(31, "Chcesz dodać kolejny Filtr? Y/N?");
        this.map.put(32, "Który Filtr?: ");
        this.map.put(33, "Brak Wyników.");


/*
        System.out.println("Walcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");
*/
        return map;
    }

}
