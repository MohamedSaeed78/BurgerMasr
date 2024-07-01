package app;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBase {
    private static DataBase instance = null;
    private HashMap<Integer, Order> orderList;
    private ArrayList<Sandwich> sandwichList;
    private ArrayList<Addition> additionsList;
    private ArrayList<Sandwich> receiptListFinal;

    private DataBase() {
        orderList = new HashMap<>();
        sandwichList = new ArrayList<>();
        additionsList = new ArrayList<>();
        receiptListFinal = new ArrayList<>();
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public HashMap<Integer, Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(HashMap<Integer, Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Sandwich> getSandwichList() {
        return sandwichList;
    }

    public void setSandwichList(ArrayList<Sandwich> sandwichList) {
        this.sandwichList = sandwichList;
    }

    public ArrayList<Addition> getAdditionsList() {
        return additionsList;
    }

    public void setAdditionsList(ArrayList<Addition> additionsList) {
        this.additionsList = additionsList;
    }

    public ArrayList<Sandwich> getReceiptListFinal() {
        return receiptListFinal;
    }

    public void setReceiptListFinal(ArrayList<Sandwich> receiptListFinal) {
        this.receiptListFinal = receiptListFinal;
    }

    public void startDataCreate() {
        //creating instance of Menu
        Menu menu = Menu.getInstance();
        //creating sandwiches
        Sandwich beefBurger = new BeefBurger("Beef Burger", 80);
        Sandwich chickenBurger = new ChickenBurger("Chicken Burger", 85);
        Sandwich cheeseBurger = new CheeseBurger("Cheese Burger", 70);
        //creating additions
        Addition catchup = new Addition("Catchup", 10);
        Addition mayonnaise = new Addition("Mayonnaise", 10);
        Addition tomatoes = new Addition("Tomatoes", 5);
        Addition cheese = new Addition("Cheese", 10);

        menu.addSandwich(chickenBurger);
        menu.addSandwich(cheeseBurger);
        menu.addAddition(mayonnaise);
        menu.addAddition(tomatoes);
        menu.addAddition(cheese);


    }
}
