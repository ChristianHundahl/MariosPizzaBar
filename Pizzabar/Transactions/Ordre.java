package Transactions;

import ALaCarte.Vare;

import java.util.ArrayList;

public class Ordre {
    private String kundenavn;
    private String afhentningstidspunkt;
    private String kommentar;
    private double total;
    private int id;
    private int idCounter;
    private ArrayList<Vare> indhold = new ArrayList<>();

    public Ordre (String kundenavn, String afhentningstidspunkt, String kommentar, double total) {
        this.kundenavn = kundenavn;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.kommentar = kommentar;
        this.total = total;
        id = idCounter +1;
        idCounter++;
    }
    /*
    public tilføjVare (){

    }

    public fjernVare () {

    }

    public String tilføjKommentar() {
        return kommentar;
    }


    @Override
    public String toString(){
        return orderList.toString();
    }*/
}