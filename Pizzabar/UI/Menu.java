package UI;

import Transactions.Ordreliste;

import java.util.Scanner;

public class Menu {
    /*
    Show menu options
    Contains sub menu(Manage order(s) menu) options
    Show ALaCarte menu
     */

    private Scanner input = new Scanner(System.in);
    private final Ordreliste ordreliste;

    public Menu(Ordreliste ordreliste){
        this.ordreliste = ordreliste;
    }


    //Prints main menu
    public void mainMenu(){
        System.out.println("Hovedmenu");
        System.out.println("1. Ny ordre");
        System.out.println("2. Manage ordrer");
        System.out.println("3. Redigér menukort");
        System.out.println("4. Se statistik");
        System.out.println("5. Exit program");
        System.out.println("Indtast valg: ");
    }

    //Prints new order menu if chosen
    public void newOrder(){
        System.out.println("Ny ordre");
        System.out.println("1. Tilføj kundeinformationer");
        System.out.println("2. Annuller");
        System.out.println("Indtast valg: ");
    }

    public void ordreValg(){
        System.out.println("1. Tilføj varer");
        System.out.println("2. Gå tilbage");
    }

    //If "Redigér ordre" is chosen show this menu
    public void manageOrdre(){
        System.out.println("Vælg en ordre at redigere");
        ordreliste.showList();
        System.out.println("1. Ordre afhentet");
        System.out.println("2. Fjern en ordre");
        System.out.println("3. Gå tilbage");
        System.out.println("Enter choice: ");
    }

    public void editMenuKort(){
        System.out.println("Redigér menukort");
        System.out.println("1. Tilføj ny vare til menukort");
        System.out.println("2. Fjern vare fra menukort");
        System.out.println("3. Gå tilbage");
    }

    public void pizzaEllerVare(){
        System.out.println("Hvad ønsker du at tilføje til menukortet");
        System.out.println("1. Tilføj pizza til menukort");
        System.out.println("2. Tilføj vare til menukort");
        System.out.println("3. Gå tilbage");
    }

    //Returns input from user, gonna be used in controller to control menus
    public int getMenuChoice(){
        String strChoice;
        strChoice = input.nextLine();

        while(!strChoice.matches("[0-9]")) {
            System.out.println("\nFejl ved input");
            System.out.println("Indtast venligst et tal: ");
            strChoice = input.nextLine();
        }

        int choice = Integer.parseInt(strChoice);
        return choice;
    }
}