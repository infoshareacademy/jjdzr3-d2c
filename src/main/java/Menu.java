import data.DrinkParser;
import domain.Drink;
import domain.DrinkRepository;
import menu.MenuEng;
import menu.MenuPL;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Menu {


    public void Menu() {
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
            mainMenu(menuMap);
            program = resetMenu(menuMap);
        } while (program);
    }

    public Map menuChoseLanguage(Map menuMap) {
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
            System.out.println(menuMap.get(90));
            System.out.println(menuMap.get(91));
        }
        }while (program);
        System.out.println(menuMap.get(01));
        System.out.println(menuMap.get(02));
        return menuMap;
    }
    public void mainMenu(Map menuMap) {
        try {
            DrinkParser drinkParser = new DrinkParser();
            DrinkRepository drinkRepository = drinkParser.readFileIntoDrinkRepository();
            List<Drink> drinks = drinkParser.readFileIntoDrinkRepository().getDrinks();
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
                        if (resetSearch.equals("Y") || resetSearch.equals("T")){
                            searchloop=true;
                        } else {
                            searchloop=false;
                        }}

                    break;
                case 4: // Za pomocą jakiego Filtru, chcesz wyświetlić drinki");
                    System.out.println(menuMap.get(40));
                    System.out.println(menuMap.get(41));
                    Filter filter = new Filter();
                    drinks= filter.Filtr(drinks);
                    for (Drink drink : drinks){
                        System.out.println(drink);
                    }
                    // uruchom filtrowanie

                    break;
                case 5: // 5 - Zarządzanie elementami
                    break;
                case 6: //6 - Zarządzanie uczestnikami
                    break;
                case 0:
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
    }
    public boolean resetMenu(Map menuMap) {
        System.out.println(menuMap.get(94));
        System.out.println(menuMap.get(95));
        boolean program = true;
                try {
            Scanner scanner = new Scanner(System.in);
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    clearScreen();
                    clrscr();
                    program = true;
                    break;
                case 2:
                    clearScreen();
                    clrscr();
                    program = false;
                    break;
                default:
                    System.out.println(menuMap.get(92));
                    System.out.println(menuMap.get(93));
                    break;
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
