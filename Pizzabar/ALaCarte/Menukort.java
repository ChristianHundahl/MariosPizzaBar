package ALaCarte;

import java.util.ArrayList;
import java.util.Scanner;

public class Menukort {
    //For keeping track of current and old menus
    private String version;
    private ArrayList<Vare> menukort = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public Menukort (String version){

        kortMenuCon();
        this.version = version;
    }


    public void kortMenuCon(){
        Pizza p2 = new Pizza("Hawaii",65.00,"Ananas");
        Pizza p3 = new Pizza("Skinke",65.00,"Skinke");
        Pizza p4 = new Pizza("Kebab",65.00,"Kebab og løg");
        Vare v2 = new Vare("Is",18.00);
        Vare v3 = new Vare("Sodavand 1.5l", 25.00);
        menukort.add(p2);
        menukort.add(p3);
        menukort.add(p4);
        menukort.add(v2);
        menukort.add(v3);
    }

    //Methods
    //Add Pizza to menu
    public void addPizza(Pizza pizza){
        Pizza tmpPizza = new Pizza();
        menukort.add(pizza);
    }
    //Add Vare to menu
    public void addVare(Vare vare){
        Vare tmpVare = new Vare();
        menukort.add(vare);
    }

    //Sortér menukort by category and price
    public void sortMenukort(){
        ArrayList<Vare> tmpPizza = new ArrayList<>();
        ArrayList<Vare> tmpAndet = new ArrayList<>();

        //Seperates the two categories
        for (Vare item : menukort){
            if(item.getType().equals("pizza")){
                tmpPizza.add(item);
            }
            else{
                tmpAndet.add(item);
            }
        }
        //Clears the menukortArrayList
        menukort.clear();


        //Sorts the two tmpArrayList by price
        for (Vare pizza : tmpPizza){
            tmpPizza = sortByPris(tmpPizza);
        }
        for (Vare andet : tmpAndet){
            tmpAndet = sortByPris(tmpAndet);
        }

        //Adds the the items back on the menukortArrayList sorted by type and price
        for (Vare item : tmpPizza){
            menukort.add(item);
        }
        for (Vare item : tmpAndet){
            menukort.add(item);
        }

        for (Vare item : menukort){
            item.setVareID(getMenukort().indexOf(item)+1);
        }
    }

    //Sorts the arrayList by price
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
    public void visMenukort(){
        int i = 1;
        System.out.println("Menukort:");
        for (Vare item : menukort){
            System.out.println( i + " " + item.toString() + " - " + item.getPris() + " kr.");
            i++;
        }
    }

    public ArrayList<Vare> getMenukort() {
        return menukort;
    }
    public void setMenukort(ArrayList<Vare> menukort) {
        this.menukort = menukort;
    }
}