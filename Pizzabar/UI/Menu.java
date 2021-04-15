package UI;

import ALaCarte.*;
import java.util.Scanner;

public class Menu {
    /*
    Show menu options
    Contains sub menu(Manage order(s) menu) options
    Show ALaCarte menu
     */

    private Scanner input = new Scanner(System.in);
    private Menukort menukort = new Menukort("v0");


    //Prints main menu
    public void mainMenu(){
        System.out.println("Main menu");
        System.out.println("1. Lav ny ordre");
        System.out.println("2. Manage order");
        System.out.println("3. Redigere menukort");
        System.out.println("4. Exit program");
        System.out.println("Enter choice: ");
    }

    //Prints new order menu if chosen
    public void newOrderMenu(){
        while(true) {
            System.out.println("New order menu");
            System.out.println("1. Tilføj pizza");
            System.out.println("2. Tilføj andre vare");
            System.out.println("3. Gå tilbage main menu");
            System.out.println("Enter choice: ");

            switch (getMenuChoice()){
                case 1:
                    System.out.println("Pizza tilføjet");
                    menukort.addPizza();
                    break;
                case 2:
                    System.out.println("Sodavand tilføjet");
                    menukort.addVare();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }


    //If manage order is chosen show this menu
    public void manageMenu(){
            System.out.println("Select the order you want to manage");
            //prints orderlist here
            System.out.println("Enter choice: ");
            //Get order from orderlist
    }

    public void editMenuCard(){
        System.out.println("1. Tilføj ny vare til menukort");
        System.out.println("2. Fjern vare fra menu kort");

    }


    //Returns input from user, gonna be used in controller to control menus
    public int getMenuChoice(){
        int choice = 0;
        while(!input.hasNextInt()){
            System.out.println("\nPlease enter a number to select your choice");
            System.out.println("Enter choice: ");
            input.nextLine();
        }
        choice = input.nextInt();
        return choice;
    }



}
