package ALaCarte;

import java.util.ArrayList;
import java.util.Scanner;

public class Menukort {
    //For keeping track of current and old menus
    private String version;
    private ArrayList<Vare> menukort = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public Menukort (String version){
        this.version = version;
    }

    //Methods
    //Add Pizza to menu
    public void addPizza(){
        System.out.println("Navn på vare: ");
        String navn = in.nextLine();
        System.out.println("VareID: ");
        int ID = in.nextInt();
        System.out.println("Pris på vare: ");
        double pris = in.nextDouble();
        System.out.println("Toppings: ");
        String topping = in.nextLine();
        in.nextLine();

        System.out.println();
        System.out.println("Pizza tilføjet til menukort.");

        Pizza tmpPizza = new Pizza(navn, ID, pris, topping);
        menukort.add(tmpPizza);

    }
    //Add Vare to menu
    public void addVare(){
        System.out.println("Navn på vare: ");
        String navn = in.nextLine();
        System.out.println("VareID: ");
        int ID = in.nextInt();
        System.out.println("Pris på vare: ");
        double pris = in.nextDouble();
        in.nextLine();

        System.out.println();
        System.out.println("Vare tilføjet til menukort.");

        Vare tmpVare = new Vare(navn, ID, pris);
        menukort.add(tmpVare);

    }

    //Sort by vareID - add method after each method
    //Remove item

    //getPizza
    //getVare

    //visMenu
    public void visMenu(){
        int i = 1;
        for (Vare item : menukort){
            System.out.println( i + " " + item.getMenuInfo() + " - " + item.getPris() + " kr.");
            i++;
        }
    }
}

class test{
    public static void main(String [] args){
        Menukort v1 = new Menukort("v1");
        v1.addPizza();
        //v1.addVare();
        v1.visMenu();
    }
}