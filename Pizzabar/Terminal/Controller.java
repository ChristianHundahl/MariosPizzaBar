package Terminal;

import ALaCarte.Menukort;
import ALaCarte.Pizza;
import ALaCarte.Vare;
import Transactions.Ordre;
import Transactions.Ordreliste;
import UI.Menu;

import java.util.Scanner;
import java.util.SortedMap;

public class Controller {
    Ordreliste ordreliste = new Ordreliste();
    Menu menu = new Menu(ordreliste);
    Menukort menukort = new Menukort("v1");
    Scanner input = new Scanner(System.in);



    public Controller() {
        Pizza p2 = new Pizza("Hawaii",65.00,"Ananas");
        Pizza p3 = new Pizza("Skinke",65.00,"Skinke");
        Pizza p4 = new Pizza("Kebab",65.00,"Kebab og løg");
        Vare v2 = new Vare("Is",18.00);
        Vare v3 = new Vare("Sodavand 1.5l", 25.00);
        menukort.addPizza(p2);
        menukort.addPizza(p3);
        menukort.addPizza(p4);
        menukort.addVare(v2);
        menukort.addVare(v3);
    }

    public void menuOptions() {
        int choice = 0;
        while (true) {
            menu.mainMenu();
            choice = menu.getMenuChoice();

            switch (choice) {
                case 1:
                    nyOrdreLoop();
                    break;
                case 2:
                    manageOrdreLoop();
                    break;
                case 3:
                    manageKortLoop();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.exit(5);
            }
        }
    }

    public void nyOrdreLoop(){
        int choice = 0;
        while(true) {
            menu.newOrder();
            choice = menu.getMenuChoice();
            switch (choice) {
                case 1:
                    Ordre ordre = new Ordre();
                    System.out.println("Kundenavn");
                    ordre.setKundenavn(input.nextLine());
                    System.out.println("Tid");
                    ordre.setAfhentningstidspunkt(input.nextLine());
                    System.out.println("Kommentar");
                    ordre.setKommentar(input.nextLine());
                    ordreLoop(ordre);
                    System.out.println(ordre);
                    ordreliste.addOrder(ordre);//Tager en ordre og tilføjer den til ordrelisten
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        }
    }

    public void ordreLoop(Ordre ordre){
        int choice = 0;
        while(true){
            System.out.println("Hvad skal tilføjes");
            menukort.sortMenukort();
            menukort.visMenukort();
            choice = menu.getMenuChoice();
            switch (choice){
                case 1:
                    ordre.tilføjVare(input.nextInt());
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        }
    }

    public void manageOrdreLoop(){
        int choice = 0;
        while(true){
            menu.manageOrdre();
            choice = menu.getMenuChoice();
            ordreliste.manageOrdre();
        }
    }

    public void manageKortLoop(){
        int choice = 0;
        while (true){
            menu.editMenuCard();
            choice = menu.getMenuChoice();
            switch (choice){
                case 1:
                    pizzaEllerVare();
                    break;
                case 2:
                    fjernFraKort();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void pizzaEllerVare () {
        int choice = 0;
        while (true) {
            menu.pizzaEllerVare();
            choice = menu.getMenuChoice();
            switch (choice) {
                case 1:
                    Pizza p = new Pizza();
                    System.out.println("Navn på Pizza");
                    p.setNavn(input.nextLine());
                    System.out.println("Pris");
                    p.setPris(input.nextDouble());
                    input.nextLine();
                    System.out.println("Topping");
                    p.setTopping(input.nextLine());
                    menukort.addPizza(p);
                    System.out.println("Pizza tilføjet");
                    menukort.sortMenukort();
                    break;
                case 2:
                    Vare v = new Vare();
                    System.out.println("Navn på vare");
                    v.setNavn(input.nextLine());
                    System.out.println("Pris");
                    v.setPris(input.nextDouble());
                    input.nextLine();
                    menukort.addVare(v);
                    System.out.println("Vare tilføjet");
                    menukort.sortMenukort();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    public void fjernFraKort(){
        int choice = 0;
        while (true){
            menukort.visMenukort();
            choice = menu.getMenuChoice();
            menukort.fjernVareFraMenukort(choice);
            menukort.sortMenukort();
            return;
        }
    }

}


