package UI;

import java.util.Scanner;

public class Menu {
    /*
    Show menu options
    Contains sub menu(Manage order(s) menu) options
    Show ALaCarte menu
     */

    private Scanner input = new Scanner(System.in);


    public void mainMenu(){
        System.out.println("Main menu");
        System.out.println("1. Make new order");
        System.out.println("2. Manage order");
        System.out.println("3. Exit program");
        System.out.println("Enter choice: ");
    }

    public void manageMenu(){
        System.out.println("Select the order you want to manage");
        System.out.println("Enter choice: ");
    }

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
