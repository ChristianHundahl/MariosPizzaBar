package Transactions;
import ALaCarte.Menukort;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordreliste {
    private ArrayList<Ordre> ordreList = new ArrayList<Ordre>();
    private ArrayList<Ordre> statistik = new ArrayList<Ordre>();
    //Sort orderList by descending order ID

    public void sortOrdreList() {
        for (int i = 0; i <ordreList.size(); i++){
            for (int j = 1; j < ordreList.size(); j++){
                if (ordreList)
            }
        }
    }

    public void showStatistik(){
        statistik.toString();
    }

    private Scanner in = new Scanner(System.in);

    public void showList(){
        System.out.println(ordreList.toString());
    }

    //Tager en ordre som input og tilføjer den til listen
    public void addOrder(Ordre ordre){
        ordreList.add(ordre);
    }
    //Method to remove order from list before completion (sale)
    public void removeOrder(){
        System.out.println("Hvilken ordre ønskes fjernet? (ID): ");
        int id = in.nextInt() - 1;
        ordreList.remove(id); //Removes index (input) from list
        System.out.println("Ordre id " + (id + 1) + " er fjernet fra listen");
    }
    //Remove finished ordre from list of active ordres after sale, while saving ordre details for statistical purposes
    public void ordreAfhentet(){
        System.out.println("Hvilken ordre er afhentet (ID): ");
        int id = in.nextInt() - 1;
        statistik.add(ordreList.get(id)); //Ordre is added to list 'statistik' before removal
        ordreList.remove(id); //Removes index (input) from list
    }
    //manageOrder
    public void manageOrdre(){
        System.out.println("Hvilken ordre skal ændres (ID): ");
        int id = in.nextInt() - 1;
        ordreList.get(id);
    }

    //ArrayList w/ ordrerlist
    //getOrderList()
    public ArrayList<Ordre> getOrdreList() {
        return ordreList;
    }
}

class test{
    public static void main(String [] args){
        Ordreliste v1 = new Ordreliste();
        //v1.addOrder();
        v1.showList();
        v1.removeOrder();
    }
}