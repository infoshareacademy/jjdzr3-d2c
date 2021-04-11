package menu;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {


    public static void main(String[] args) {
        Map<Integer, String> menuMap = new HashMap<>();

        System.out.println("Walcome in project \"Bartender\'s Handybook\" ");
        System.out.println("Created by:");
        System.out.println("Drink 2 Code!");
        System.out.print("Credits: Agnieszka Gutowska, Artur Zabiegliński, ");
        System.out.println("Przemysław Pettka, Sandra Kowalska. \n");

        System.out.println("Chose Lenguage:");
        System.out.println("1 - For Polish");
        System.out.println("2 - For English");
        boolean program = true;
        while (program) {
            try {
                Scanner scanner = new Scanner(System.in);
                int chose = scanner.nextInt();
                switch (chose) {
                    case 1:
                        MenuEng menuEng = new MenuEng();
                        menuMap.putAll(menuEng.getMenuEng());

                        break;
                    case 2:
                        MenuPL menuPL = new MenuPL();
                        menuMap.putAll(menuPL.getMenuPl());
                        break;
                    default:
                        System.out.println("Podałeś niewłaściwy argument");
                        System.out.println("Program zakończy swoje działanie");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Miała być cyfra");
                System.out.print("Podaj cyfre, a program w końcu zadziała: ");
            }

            try {
                menuMap.get(01);
                menuMap.get(02);
                menuMap.get(11);    //1 - Wyświetl wszystkie Elementy z Bazy
                menuMap.get(12);    //2 - Wyświetl pojedyńczy losowy element z Bazy
                menuMap.get(13);    //3 - Wyszukaj Drink
                menuMap.get(14);    //4 - Filtruj wyświetlone Drinki
                menuMap.get(15);    //5 - Zarządzanie elementami");
                menuMap.get(16);    //6 - Zarządzanie uczestnikami");
                menuMap.get(00);
                Scanner scanner = new Scanner(System.in);
                int chose = scanner.nextInt();




                switch (chose) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        menuMap.get(30);
                        menuMap.get(31);
                        menuMap.get(32);
                        menuMap.get(33);
                        menuMap.get(34);
                        menuMap.get(35);
                        menuMap.get(36);
                        menuMap.get(36);
                        menuMap.get(03);
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 0:
                        break;

                    default:
                        System.out.println("Podałeś niewłaściwy argument");
                        System.out.println("Program zakończy swoje działanie");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Miała być cyfra");
                System.out.print("Podaj cyfre, a program w końcu zadziała: ");
            }







            //Ponowne uruchomienie programu
            System.out.println("Chcesz uruchomić program jeszcze raz?");
            System.out.println("Wpisz \"1\" jeżeli tak");
            try {
                Scanner scanner = new Scanner(System.in);
                int chose = scanner.nextInt();
                switch (chose) {
                    case 1:
                        // clr screan @Todo
                        program = true;
                        break;
                    case 2:
                        // clr screan @Todo
                        program = false;
                        break;
                    default:

                }

            } catch (Exception e) {
                System.out.println("Miała być cyfra");
                System.out.print("Podaj cyfre, a program w końcu zadziała: ");
            }


        }




    }


    public Map<Integer, String> Credits() {
        Map<Integer, String> map = new HashMap<>();


        return map;

    }

    
    
}
