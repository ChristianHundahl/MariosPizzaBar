package ALaCarte;

public class Pizza extends Vare {
    private String topping;

    public Pizza (String navn, int ID, double pris, String topping){
        super(navn,ID,pris);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String getMenuInfo() {
        return (super.getMenuInfo() + "; " + getTopping());
    }
}
