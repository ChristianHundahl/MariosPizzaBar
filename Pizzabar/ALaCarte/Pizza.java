package ALaCarte;

public class Pizza extends Vare {
    String topping;

    public Pizza (String navn, int ID, double pris, String topping){
        super(navn,ID,pris);
        this.topping = topping;
    }
}
