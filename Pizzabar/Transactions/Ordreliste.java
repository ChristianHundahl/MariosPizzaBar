package Transactions;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordreliste {
    private ArrayList<Ordre> ordreList = new ArrayList<>();
    private ArrayList<Ordre> statistik = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    //Sort orderList by descending order ID

    public ArrayList<Ordre> sortByAfhentningstidspunkt(ArrayList<Ordre> ordreList){
        Ordre temp;
        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for (int i = 0; ordreList.size() - 1 > i; i++) {
                if (ordreList.get(i).compareTo(ordreList.get(i + 1)) > 0) { //afhentningstidspunkt changed to int
                    temp = ordreList.get(i);
                    ordreList.set(i, ordreList.get(i + 1));
                    ordreList.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return ordreList;
    }

    public void showStatistik(){
        System.out.println(statistik.toString());
    }

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