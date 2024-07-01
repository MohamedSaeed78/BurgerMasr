package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Receipt {
    private ArrayList <Sandwich> receiptListFinal ;

    public Receipt() {
        receiptListFinal = DataBase.getInstance().getReceiptListFinal();
    }


    public void addItemsToReceipt(Sandwich sandwich) {
        //as for sandwich or addition to be added to recite with protection using instance of to check the object before adding the object.

        receiptListFinal.add(sandwich);

    }

    public double receiptSumOfPrice() {
        double totalPrice = 0.0;
        for (Sandwich sandwich : receiptListFinal) {
            totalPrice += sandwich.getPrice();
        }
        return totalPrice;
    }

    public void displayReceipt() {//still need work on receipt items counter
        receiptListFinal.sort(Comparator.comparingDouble(Sandwich::getPrice));
        Collections.reverse(receiptListFinal);
        for (int i = 0; i < receiptListFinal.size(); i++) {
            System.out.println("1." + receiptListFinal.get(i).getName() + " " + receiptListFinal.get(i).getPrice());
        }
    }
}
