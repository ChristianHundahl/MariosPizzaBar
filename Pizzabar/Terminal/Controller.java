package Terminal;

import ALaCarte.Menukort;
import ALaCarte.Pizza;
import ALaCarte.Vare;
import Transactions.Ordreliste;
import UI.Menu;

import java.util.Scanner;

public class Controller {
    Ordreliste ordreliste = new Ordreliste();
    Menu menu = new Menu(ordreliste);
    Menukort menukort = new Menukort("v1");
    Scanner input = new Scanner(System.in);


    public Controller() { }

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
                    ordreliste.addOrder();
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

}


