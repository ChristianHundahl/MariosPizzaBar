package ALaCarte;

public class Vare {
    private String navn;
    private int vareID;
    private double pris;

    public Vare (String navn, int ID, double pris){
        this.navn = navn;
        this.vareID = ID;
        this.pris = pris;
    }

    public String getMenuInfo(){
        return navn;
    }

    public double getPris() {
        return pris;
    }
}
