package ALaCarte;

public class Pizza extends Vare {
    private String topping;
    private String type = "pizza";

    public Pizza(){}

    public Pizza (String navn, double pris, String topping){
        super(navn,pris);
        this.topping = topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return (super.toString() + "; " + getTopping());
    }
}
