package ALaCarte;

import java.util.ArrayList;

public class Menukort {
    //For keeping track of current and old menus
    private String version;
    private ArrayList<Vare> Menukort = new ArrayList<>();


    //Methods
    //Add Pizza to menu
    public void addPizza(String navn, int ID, double pris, String topping){

        Pizza tmpPizza = new Pizza(navn, ID, pris, topping);
        Menukort.add(tmpPizza);

    }
    //Add Vare to menu
    public void addVare(String navn, int ID, double pris){

        Vare tmpVare = new Vare(navn, ID, pris);
        Menukort.add(tmpVare);
    }

    //getPizza
    //getVare
}