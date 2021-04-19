package UI;

import ALaCarte.Menukort;
import Terminal.Controller;
import Transactions.Ordreliste;

public class MenuTest {
    public static void main(String[] args) {

        Controller controller = new Controller();
        while(true){
            controller.menuOptions();
        }
    }
}
