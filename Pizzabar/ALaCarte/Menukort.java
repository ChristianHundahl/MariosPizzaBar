package ALaCarte;

import java.util.ArrayList;
import java.util.Scanner;

public class Menukort {
    //For keeping track of current and old menus
    private String version;
    private ArrayList<Vare> menukort = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public Menukort (String version){
        this.version = version;
    }

    //Methods
    //Add Pizza to menu
    public void addPizza(){
        System.out.println("Navn på vare: ");
        String navn = in.nextLine();
        //System.out.println("VareID: ");
        //int ID = in.nextInt();
        System.out.println("Pris på vare: ");
        double pris = in.nextDouble();
        in.nextLine();
        System.out.println("Toppings: ");
        String topping = in.nextLine();

        System.out.println();
        System.out.println("Pizza tilføjet til menukort.");

        Pizza tmpPizza = new Pizza(navn, pris, topping);
        menukort.add(tmpPizza);

    }
    //Add Vare to menu
    public void addVare(){
        System.out.println("Navn på vare: ");
        String navn = in.nextLine();
        //System.out.println("VareID: ");
        //int ID = in.nextInt();
        System.out.println("Pris på vare: ");
        double pris = in.nextDouble();
        in.nextLine();

        System.out.println();
        System.out.println("Vare tilføjet til menukort.");

        Vare tmpVare = new Vare(navn, pris);
        menukort.add(tmpVare);
    }

    //Sortér menukort - add method after each method
    public void sortMenukort(){
        ArrayList<Vare> tmpPizza = new ArrayList<>();
        ArrayList<Vare> tmpAndet = new ArrayList<>();

        for (Vare item : menukort){
            if(item.getType().equals("pizza")){
                tmpPizza.add(item);
            }
            else{
                tmpAndet.add(item);
            }
        }
        for (Vare pizza : tmpPizza){
            tmpPizza = sortByPris(tmpPizza);
        }
        for (Vare andet : tmpAndet){
            tmpAndet = sortByPris(tmpAndet);
        }

        //TODO finish method - add the tmpLists to a finished list


    }

    //Sorts the methods by price
    public ArrayList<Vare> sortByPris(ArrayList<Vare> array){
        Vare temp;
        boolean sorted = false;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < array.size()-1; i++) {
                if (array.get(i).compareTo(array.get(i + 1)) > 0) {
                    temp = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

        return array;
    }



    //Remove item by index - 1
    public void fjernVareFraMenukort(int nummer){
        menukort.remove(nummer - 1);
    }


    //getVare by index - 1
    public Vare hentVareFraMenukort(int nummer){
        return menukort.get(nummer - 1);
    }

    //visMenu
    public void visMenu(){
        int i = 1;
        System.out.println("Menukort:");
        for (Vare item : menukort){
            System.out.println( i + " " + item.getMenuInfo() + " - " + item.getPris() + " kr.");
            i++;
        }
    }

    public ArrayList<Vare> getMenukort() {
        return menukort;
    }
}

class test{
    public static void main(String [] args){
        Menukort v1 = new Menukort("v1");
        v1.addPizza();
        v1.addVare();
        v1.visMenu();
        v1.sortMenukort();

    }
}