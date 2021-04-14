package Transactions;

public class Ordre {
    private String kundenavn;
    private String afhentningstidspunkt;
    private String kommentar;
    private double total;

    public Ordre (String kundenavn, String afhentningstidspunkt, String kommentar, double total) {
        this.kundenavn = kundenavn;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.kommentar = kommentar;
        this.total = total;
    }

    public String tilføjKommentar() {
        return kommentar;
    }
}