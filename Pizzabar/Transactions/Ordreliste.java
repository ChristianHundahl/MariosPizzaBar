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
    public void removeOrder(int id){
        ordreList.remove(id-1); //Removes index (input) from list
        System.out.println("Ordre fjernet");
    }
    //Remove finished ordre from list of active ordres after sale, while saving ordre details for statistical purposes
    public void ordreAfhentet(int id){
        statistik.add(ordreList.get(id-1)); //Ordre is added to list 'statistik' before removal
        ordreList.remove(id-1); //Removes index (input) from list
    }
    //manageOrder
    public void manageOrdre(int id){
        Ordre ordre = ordreList.get(id - 1);
        System.out.println(ordre.toString());
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
       // v1.removeOrder();
    }
}