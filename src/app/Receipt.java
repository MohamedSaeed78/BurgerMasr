package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Receipt {
    private List<Sandwich> receiptListFinal;

    public Receipt() {
        receiptListFinal = new ArrayList<Sandwich>();
    }

    public List<Sandwich> getReceiptListFinal() {
        return receiptListFinal;
    }

    public void setReceiptListFinal(List<Sandwich> receiptListFinal) {
        this.receiptListFinal = receiptListFinal;
    }

    public void addItemsToReceipt(Sandwich sandwich) { //as for sandwich or addition to be added to recite with protection using instance of to check the object before adding the object.
        receiptListFinal.add(sandwich);
    }
    public double receitpSumOfPrice(){
        double totalPrice=0.0;
        for (Sandwich sandwich: receiptListFinal){
            totalPrice += sandwich.getPrice();
        }
        return totalPrice;
    }

    public void displayReceipt(){
        receiptListFinal.sort(Comparator.comparingDouble(Sandwich::getPrice));
        Collections.reverse(receiptListFinal);
        for (int i = 0; i <receiptListFinal.size() ; i++) {
            System.out.println("1." + receiptListFinal.get(i).getName() + " " + receiptListFinal.get(i).getPrice());
        }
    }
}
