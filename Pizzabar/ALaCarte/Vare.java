package ALaCarte;

public class Vare {
    private String navn;
    private int vareID;
    private double pris;
    private String type = "andet";

    public Vare (String navn, double pris){
        this.navn = navn;
        //this.vareID = ID;
        this.pris = pris;
    }

    public String getMenuInfo(){
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    public void setVareID(int vareID) {
        this.vareID = vareID;
    }

    public int getVareID() {
        return vareID;
    }

    //Compare to method
    public int compareTo (Vare vare){
        int res = 0;
        if (this.pris < vare.getPris()){
            res =- 1;
        }
        if (this.pris > vare.getPris()){
            res = 1;
        }
        return res;
    }

}
