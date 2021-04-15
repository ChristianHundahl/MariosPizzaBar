package Transactions;
import java.util.Scanner;
import ALaCarte.*;

import java.util.ArrayList;

public class Ordre {
    private String kundenavn;
    private String afhentningstidspunkt;
    private String kommentar;
    private double total;
    private int id;
    private int idCounter;
    Scanner in = new Scanner(System.in);
    private ArrayList<Vare> indhold = new ArrayList<>();

    public Ordre (String kundenavn, String afhentningstidspunkt, String kommentar, double total/*ArrayList<Vare> indhold*/) {
        this.kundenavn = kundenavn;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.kommentar = tilføjKommentar();
        this.total = total;
        //this.indhold = indhold;
        id = idCounter +1;
        idCounter++;
    }

    public void tilføjVare (){
        System.out.println("Tilføj varer til ordren: ");
        int id = in.nextInt();
        Menukort m = new Menukort("v1");
        indhold.add(m.getMenukort().get(id));
    }

    public void fjernVare () {
        System.out.println("Hvilken ordre ønskes fjernet? (ID): ");
        id = in.nextInt();
        indhold.remove(id); //Removes index (id) from list
        System.out.println("Ordre id " + id + " er fjernet fra listen");
    }

    public String tilføjKommentar() {
        System.out.println("Skriv en kommentar til ordren: ");
        String kommentar = in.nextLine();
        return kommentar;
    }


    @Override
    public String toString(){
        return indhold.toString();
    }
}