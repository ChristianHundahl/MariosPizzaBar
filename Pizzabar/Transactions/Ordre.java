package Transactions;
import java.util.Scanner;
import ALaCarte.*;

import java.util.ArrayList;

public class Ordre {
    //Attributes for class Ordre
    private String kundenavn;
    private int afhentningstidspunkt;
    private String kommentar;
    private double total;
    private int id;
    private static int idCounter = 0;
    Scanner in = new Scanner(System.in);
    private Menukort currentMenu = new Menukort("v1");
    private ArrayList<Vare> indhold = new ArrayList<>();

    /*Constructor Ordre
    Empty Ordre so the user can set attributes*/
    public Ordre(){
        this.indhold = new ArrayList<Vare>();
        id = idCounter +1;
        idCounter++;
    }

    public void tilføjVare (int id){
        System.out.println("Tilføj varer til ordren: ");
        indhold.add(currentMenu.hentVareFraMenukort(id));
    }

    @Override
    public String toString(){
        String finalOrdre =
                "\n Kunde: " + kundenavn +
                "\n Afhentning: " + afhentningstidspunkt +
                "\n Total: " + total +
                "\n ID: " + id+
                "\n Indhold: " + indhold +"\n";
        if (kommentar.matches("[a-zA-Z]+")) { //Comment is added if in.nextLine contains characters a to z
            finalOrdre += "\n Kommentar: " + kommentar +"\n";
        }
        return finalOrdre;
    }

    //Not used, but can be useful if the program is developed further
    public String getKundenavn() {
        return kundenavn;
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }

    public int getAfhentningstidspunkt() {
        return afhentningstidspunkt;
    }

    public void setAfhentningstidspunkt(int afhentningstidspunkt) {
        this.afhentningstidspunkt = afhentningstidspunkt;
    }

    //Not used, but can be useful if the program is developed further
    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public int compareTo (Ordre ordre){
        int res = 0;
        if (this.afhentningstidspunkt < ordre.getAfhentningstidspunkt()){
            res =- 1;
        }
        if (this.afhentningstidspunkt > ordre.getAfhentningstidspunkt()){
            res = 1;
        }
        return res;
    }

}