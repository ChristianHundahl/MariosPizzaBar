package Transactions;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordreliste {
    private ArrayList<Ordre> ordreList = new ArrayList<>();
    private ArrayList<Ordre> statistik = new ArrayList<>();

    public ArrayList<Ordre> sortByAfhentningstidspunkt(ArrayList<Ordre> ordreList){//Sort ordreList by afhentningstidspunkt
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

    //Use an Ordre as input and adds to list
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

    public ArrayList<Ordre> getOrdreList() {
        return ordreList;
    }
}