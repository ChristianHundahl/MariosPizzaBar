package Transactions;
import ALaCarte.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordreliste {
    ArrayList<Ordre> orderList = new ArrayList<Ordre>();
    Scanner in = new Scanner(System.in);

    public void showList(){
        System.out.println(orderList.toString());
    }

    public void addOrder(String kundenavn, String afhentningstidspunkt, String kommentar, double total){
        System.out.println("Kundenavn: ");
        String navn = in.nextLine();
        System.out.println("Afhentningstidspunkt: ");
        String afhentTid = in.nextLine();
        System.out.println("Kommentar: ");
        String kom = in.nextLine();
        System.out.println("Total: ");
        double sum = in.nextDouble();
        in.nextLine();

        System.out.println();
        System.out.println("Ordren er tilføjet.");

        Ordre tempOrdre = new Ordre(kundenavn, afhentningstidspunkt, kommentar, total);
        orderList.add(tempOrdre);
    }

    public void removeOrder(){

    }


    //ArrayList w/ ordrerlist
    //getOrder()
    //removeOrder()
    //showList();
}
