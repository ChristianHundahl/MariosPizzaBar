package UI;

import java.util.Scanner;

public class Menu {
    /*
    Show menu options
    Contains sub menu(Manage order(s) menu) options
    Show ALaCarte menu
     */

    private Scanner input = new Scanner(System.in);


    //Prints main menu
    public void mainMenu(){
        System.out.println("Main menu");
        System.out.println("1. Make new order");
        System.out.println("2. Manage order");
        System.out.println("3. Exit program");
        System.out.println("Enter choice: ");
    }

    //Prints new order menu if chosen
    public void newOrderMenu(){
        System.out.println("New order menu");
        System.out.println("1. add pizza");
        System.out.println("2. add other");
        System.out.println("Enter choice: ");
    }


    //If manage order is chosen show this menu
    public void manageMenu(){
        System.out.println("Select the order you want to manage");
        System.out.println("Enter choice: ");
    }

    //Returns input from user, gonna be used in controller to control menus
    public int getMenuChoice(){
        int choice = 0;
        while(!input.hasNextInt()){
            System.out.println("\nPlease enter a number to select your choice");
            System.out.println("\nEnter choice: ");
            input.nextLine();
        }
        choice = input.nextInt();
        return choice;
    }



}
