package Transactions;
import java.util.ArrayList;

public class Ordreliste {
    ArrayList<Ordre> orderList = new ArrayList<Ordre>();

    @Override
    public String toString(){
        return orderList.toString();
    }
    public void showList(){
        System.out.println(orderList.toString());
    }

    public void addOrder(){

    }

    public void removeOrder(){

    }


    //ArrayList w/ ordrerlist
    //getOrder()
    //removeOrder()
    //showList();
}
