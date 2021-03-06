package com.infoshareademy;
import com.infoshareademy.data.DrinkParser;
import com.infoshareademy.domain.Drink;
import com.infoshareademy.domain.DrinkRepository;
import com.infoshareademy.menu.MenuEng;
import com.infoshareademy.menu.MenuPL;
import com.infoshareademy.management.AddDrink;
import com.infoshareademy.management.DeleteDrink;
import com.infoshareademy.management.EditDrink;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Menu {


    public void menu(DrinkParser drinkParser, DrinkRepository drinkRepository, List<Drink> drinks) {
        Map<Integer, String> menuMap = new HashMap<>();

        System.out.println("Walcome in project \"Bartender's Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");
        System.out.println("Chose Lenguage:");
        System.out.println("1 - For Polish");
        System.out.println("2 - For English");
        boolean program = true;

        menuChoseLanguage(menuMap);

        do {
            program = mainMenu(menuMap, drinkParser, drinkRepository, drinks, program);
            if (program) program = resetMenu(menuMap);
        } while (program);
    }

    public void menuChoseLanguage(Map<Integer, String> menuMap) {
        boolean program = true;
        do {
            try {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1 -> {
                    MenuPL menuPL = new MenuPL();
                    menuMap.putAll(menuPL.getMenuPl());
                    program=false;
                }
                case 2 -> {
                    MenuEng menuEng = new MenuEng();
                    menuMap.putAll(menuEng.getMenuEng());
                    program=false;
                }
                default -> {
                    System.out.println("Please write \"1\" or \"2\"");
                    System.out.print("Chose Again: ");
                }
            }
        } catch (Exception e) {
                System.out.println("Enter number and app will be work proply: ");
                System.out.println("Wrong input");
        }
        }while (program);
        System.out.println(menuMap.get(1));
        System.out.println(menuMap.get(2));
    }
    public boolean mainMenu(Map<Integer, String> menuMap, DrinkParser drinkParser, DrinkRepository drinkRepository, List<Drink> drinks, Boolean program) {
        try {
            System.out.println(menuMap.get(11));    //1 - Wyświetl wszystkie Elementy z Bazy
            System.out.println(menuMap.get(12));    //2 - Wyświetl pojedyńczy losowy element z Bazy
            System.out.println( menuMap.get(13));    //3 - Wyszukaj Drink
            System.out.println(menuMap.get(14));    //4 - Filtruj wyświetlone Drinki
            System.out.println(menuMap.get(15));    //5 - Zarządzanie elementami
            System.out.println(menuMap.get(16));    //6 - Zarządzanie uczestnikami
            System.out.println(menuMap.get(00));
            System.out.println(menuMap.get(05));   // Wybierz Opcję, którą chcesz uruchomić:
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1: //1 - Wyświetl wszystkie Elementy z Bazy
                    for (Drink drink : drinks){
                        System.out.println(drink);
                    }
                    break;
                case 2:    //2 - Wyświetl pojedyńczy losowy element z Bazy
                    System.out.println("In Develop Progress");

                    break;
                case 3:   //3 - Wyszukaj Drink
                    boolean searchloop=true;
                    while (searchloop){
                        Search.search(drinkRepository);
                        System.out.println(menuMap.get(20));
                        scanner = new Scanner(System.in);
                        String resetSearch = scanner.next();
                        searchloop= resetSearch.equals("Y") || resetSearch.equals("T");
                    }

                    break;
                case 4: // Za pomocą jakiego Filtru, chcesz wyświetlić drinki");
                    System.out.println(menuMap.get(40));
                    System.out.println(menuMap.get(41));
                    Filter filter = new Filter();
                    drinks= filter.filter(drinks, menuMap);
                    if (!drinks.isEmpty()) {
                        for (Drink drink : drinks) {
                            System.out.println(drink);
                        }

                    }else {
                        System.out.println(menuMap.get(33));
                    }
                    // uruchom filtrowanie

                    break;
                case 5: // 5 - Zarządzanie elementami
                    System.out.println("What would you like to do? 1 - Add new drink, 2 - Remove drink , 3 - Edit drink , 4 - Cancel changes");
                    scanner = new Scanner(System.in);
                    Integer managementChoose = scanner.nextInt();
                    if (managementChoose==1) {AddDrink.addDrink();
                    }else if(managementChoose==2){
                    DeleteDrink.searchNameAndDelete();
                    }else if(managementChoose==3) {
                        EditDrink.drinkEdition();
                    }else if(managementChoose==4){
                        EditDrink.cancelChanges();
                    }
                    break;
                case 6: //6 - Zarządzanie uczestnikami
                    break;
                case 0:
                    program = false;
                    break;
                default:
                    System.out.println(menuMap.get(92));
                    System.out.println(menuMap.get(93));
                    break;
            }
        }catch (Exception e) {
            System.out.println(menuMap.get(90));
            System.out.println(menuMap.get(91));
        }
        return program;
    }
    public boolean resetMenu(Map<Integer, String> menuMap) {
        System.out.println(menuMap.get(94));
        System.out.println(menuMap.get(95));
        boolean program = true;
                try {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
                    switch (chose) {
                        case 1 -> {
                            clearScreen();
                            //clrscr();
                            program = true;
                        }
                        case 2 -> {
                            clearScreen();
                            //clrscr();
                            program = false;
                        }
                        default -> {
                            System.out.println(menuMap.get(92));
                            System.out.println(menuMap.get(93));
                        }
                    }
        } catch (Exception e) {
            System.out.println(menuMap.get(90));
            System.out.println(menuMap.get(91));
        }
        return program;
    }
    public Map<Integer, String> Credits() {
        Map<Integer, String> map = new HashMap<>();
        return map;
    }
    public  void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

        } catch (InterruptedException | IOException ex) {}

    }
    public  void clearScreen() {

    System.out.print("\033[H\033[2J");

    System.out.flush();

}
}
