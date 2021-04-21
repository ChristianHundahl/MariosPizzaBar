package Terminal;

import ALaCarte.Menukort;
import ALaCarte.Pizza;
import ALaCarte.Vare;
import Transactions.Ordre;
import Transactions.Ordreliste;
import UI.Menu;

import java.util.Scanner;


public class Controller {
    private Ordreliste ordreliste = new Ordreliste();
    private Menu menu = new Menu(ordreliste);
    private Menukort menukort = new Menukort("v1");
    private Scanner input = new Scanner(System.in);

    public Controller() {
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
                    ordreliste.showStatistik();
                    System.out.println("Press enter to return");
                    input.nextLine();
                    break;
                case 5:
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
                    ordre.setAfhentningstidspunkt(input.nextInt());
                    System.out.println("Kommentar");
                    ordre.setKommentar(input.nextLine());
                    ordreLoop(ordre);
                    System.out.println(ordre);
                    ordreliste.addOrder(ordre);//Tager en ordre og tilføjer den til ordrelisten
                    ordreliste.sortByAfhentningstidspunkt(ordreliste.getOrdreList());
                    input.nextLine();
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
            menukort.sortMenukort();
            menu.ordreValg();
            choice = menu.getMenuChoice();
            switch (choice){
                case 1:
                    menukort.visMenukort();
                    ordre.tilføjVare(input.nextInt());
                    continue;
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
            switch (choice){
                case 1:
                    System.out.println("Vælg en ordre som er afhentet: ");
                    ordreliste.ordreAfhentet(input.nextInt());
                    ordreliste.sortByAfhentningstidspunkt(ordreliste.getOrdreList());
                    continue;
                case 2:
                    System.out.println("Vælg en ordre som skal slettes");
                    ordreliste.removeOrder(input.nextInt());
                    ordreliste.sortByAfhentningstidspunkt(ordreliste.getOrdreList());
                    continue;
                case 3:
                    return;
                default:
                    break;
            }
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


