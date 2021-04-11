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
                        menuMap.get(92);
                        menuMap.get(93);
                        break;
                }
            }catch (Exception e) {
                menuMap.get(90);
                menuMap.get(91);

            }

            try {
                menuMap.get(01);
                menuMap.get(02);
                menuMap.get(11);    //1 - Wyświetl wszystkie Elementy z Bazy
                menuMap.get(12);    //2 - Wyświetl pojedyńczy losowy element z Bazy
                menuMap.get(13);    //3 - Wyszukaj Drink
                menuMap.get(14);    //4 - Filtruj wyświetlone Drinki
                menuMap.get(15);    //5 - Zarządzanie elementami
                menuMap.get(16);    //6 - Zarządzanie uczestnikami
                menuMap.get(00);
                Scanner scanner = new Scanner(System.in);
                int chose = scanner.nextInt();
                switch (chose) {
                    case 1: //1 - Wyświetl wszystkie Elementy z Bazy



                        break;
                    case 2:    //2 - Wyświetl pojedyńczy losowy element z Bazy
                        break;
                    case 3:   //3 - Wyszukaj Drink
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
                    case 4: // Za pomocą jakiego Filtru, chcesz wyświetlić drinki");
                        menuMap.get(40);
                        menuMap.get(31);
                        menuMap.get(32);
                        menuMap.get(33);
                        menuMap.get(34);
                        menuMap.get(35);
                        menuMap.get(36);
                        menuMap.get(36);
                        menuMap.get(03);
                        // uruchom filtrowanie

                        break;
                    case 5: // 5 - Zarządzanie elementami
                        break;
                    case 6: //6 - Zarządzanie uczestnikami
                        break;
                    case 0:
                        break;

                    default:
                        menuMap.get(92);
                        menuMap.get(93);
                        break;
                }
            }catch (Exception e) {
                menuMap.get(90);
                menuMap.get(91);
            }







            //Ponowne uruchomienie programu
            System.out.println("Chcesz uruchomić program jeszcze raz?");
            System.out.println("Wpisz \"1\" jeżeli tak");
            try {
                Scanner scanner = new Scanner(System.in);
                int chose = scanner.nextInt();
                switch (chose) {
                    case 1:
                        // TODO: clr screan
                        program = true;
                        break;
                    case 2:
                        // TODO: clr screan
                        program = false;
                        break;
                    default:
                        menuMap.get(92);
                        menuMap.get(93);
                        break;
                }

            } catch (Exception e) {
                menuMap.get(90);
                menuMap.get(91);
            }


        }




    }


    public Map<Integer, String> Credits() {
        Map<Integer, String> map = new HashMap<>();


        return map;

    }

    
    
}
