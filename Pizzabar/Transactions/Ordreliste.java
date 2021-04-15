package Transactions;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordreliste {
    ArrayList<Ordre> ordreList = new ArrayList<Ordre>();
    Scanner in = new Scanner(System.in);

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
        System.out.println("Total: ");
        double total = in.nextDouble();
        in.nextLine();

        System.out.println();
        System.out.println("Ordren er tilføjet.");

        Ordre tempOrdre = new Ordre(kundenavn, afhentningstidspunkt, kommentar, total);
        ordreList.add(tempOrdre);
    }

    public void removeOrder(){
        System.out.println("Hvilken ordre ønskes fjernet? (ID): ");
        int id = in.nextInt();
        Ordre sletOrdre = ordreList.remove(id - 1); //Removes index (input -1) from list
        System.out.println("Ordre id " + id + " er fjernet fra listen");
    }


    //ArrayList w/ ordrerlist
    //getOrder()
    //removeOrder()
    //showList();
}