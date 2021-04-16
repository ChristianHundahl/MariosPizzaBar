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
        System.out.println("Afhentningstidspunkt: ");
        String afhentningstidspunkt = in.nextLine();
        System.out.println("Kommentar: ");
        String kommentar = in.nextLine();
        System.out.println();
        System.out.println("Ordren er tilføjet.");

        Ordre tempOrdre = new Ordre(kundenavn, afhentningstidspunkt, kommentar); //tempOrdre skiftes til nyOrdre?
        ordreList.add(tempOrdre);
    }
    //Method to remove order from list before completion (sale)
    public void removeOrder(){
        System.out.println("Hvilken ordre ønskes fjernet? (ID): ");
        int id = in.nextInt();
        Ordre sletOrdre = ordreList.remove(id - 1); //Removes index (input -1) from list
        System.out.println("Ordre id " + id + " er fjernet fra listen");
    }
    //Remove finished ordre from list of active ordres after sale, while saving ordre details for statistical purposes
    public void ordreAfhentet(){
        System.out.println("Hvilken ordre er afhentet (ID): ");
        int id = in.nextInt();
        Ordre afhentet = ordreList.remove(id - 1); //Removes index (input -1) from list
        statistik.add(afhentet);
        System.out.println("Ordre id " + id + " er afhentet");
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