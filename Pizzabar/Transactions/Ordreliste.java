package Transactions;
import ALaCarte.Menukort;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordreliste {
    private ArrayList<Ordre> ordreList = new ArrayList<Ordre>();
    private ArrayList<Ordre> statistik = new ArrayList<Ordre>();
    private Scanner in = new Scanner(System.in);


    public void showList(){
        System.out.println(ordreList.toString());
    }

    public void addOrder(){
        System.out.println("Kundenavn: ");
        String kundenavn = in.nextLine();
        System.out.println("Afhentningstidspunkt (HHmm) : "); //Bruger inputter 4 tal, der formateres til tid
        String klokkeslæt = in.nextLine();
        StringBuilder afhentningstidspunkt = new StringBuilder(klokkeslæt);
        afhentningstidspunkt.insert(2, ":"); //Bygger 4 tal til klokkesløt
        System.out.println("Kommentar: ");
        String kommentar = in.nextLine();
        System.out.println("\nOrdren er tilføjet.");

        Ordre tempOrdre = new Ordre(kundenavn, afhentningstidspunkt.toString(), kommentar); //tempOrdre skiftes til nyOrdre?
        ordreList.add(tempOrdre);
    }
    //Method to remove order from list before completion (sale)
    public void removeOrder(){
        System.out.println("Hvilken ordre ønskes fjernet? (ID): ");
        int id = in.nextInt() + 1;
        ordreList.remove(id); //Removes index (input) from list
        System.out.println("Ordre id " + id + " er fjernet fra listen");
    }
    //Remove finished ordre from list of active ordres after sale, while saving ordre details for statistical purposes
    public void ordreAfhentet(){
        System.out.println("Hvilken ordre er afhentet (ID): ");
        int id = in.nextInt() + 1;
        statistik.add(ordreList.get(id));
        ordreList.remove(id); //Removes index (input) from list
    }
    //manageOrder
    public void manageOrdre(){
        System.out.println("Hvilken ordre skal ændres (ID): ");
        int id = in.nextInt() + 1;
        ordreList.get(id);
    }

    //ArrayList w/ ordrerlist
    //getOrder()

    //showList();

}

class test{
    public static void main(String [] args){
        Ordreliste v1 = new Ordreliste();
        v1.addOrder();
        v1.showList();
        v1.removeOrder();
    }
}