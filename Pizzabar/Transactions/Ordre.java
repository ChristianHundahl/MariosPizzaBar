package Transactions;
import java.util.Scanner;
import ALaCarte.*;

import java.util.ArrayList;

public class Ordre {
    //Attributes for class Ordre
    //TODO index errors
    //TODO when getting object from Menukort.java use index no.
    private String kundenavn;
    private String afhentningstidspunkt;
    private String kommentar;
    private double total;
    private int id;
    private static int idCounter = 0;
    Scanner in = new Scanner(System.in);
    private Menukort currentMenu = new Menukort("v1");
    private ArrayList<Vare> indhold = new ArrayList<>();

    //Constructor Ordre
    /*
    Empty ordre så kan man ved brug af setter og getters selv andgive attributter
     */
    public Ordre(){
        this.indhold = new ArrayList<Vare>();
        id = idCounter +1;
        idCounter++;
    }

    public void tilføjVare (int id){
        System.out.println("Tilføj varer til ordren: ");
        //this.id = id; Skal ikke ændre ordre ID
        indhold.add(currentMenu.hentVareFraMenukort(id));
    }

    public void fjernVare () {
        System.out.println("Hvilken ordre ønskes fjernet? (ID): ");
        id = in.nextInt();
        indhold.remove(id - 1); //Removes index (id) from list
        System.out.println("Ordre id " + id + " er fjernet fra listen");
    }

    public void udregnTotal(){
        this.total = 0;
        for (Vare item : indhold){
            total += item.getPris();
        }
    }

    public double getTotal() {
        return total;
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

    public String getKundenavn() {
        return kundenavn;
    }

    public void setKundenavn(String kundenavn) {
        this.kundenavn = kundenavn;
    }

    public String getAfhentningstidspunkt() {
        return afhentningstidspunkt;
    }

    public void setAfhentningstidspunkt(String afhentningstidspunkt) {
        this.afhentningstidspunkt = afhentningstidspunkt;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

}