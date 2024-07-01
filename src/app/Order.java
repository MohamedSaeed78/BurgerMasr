package app;

public class Order {
    /*
    1- request order (send order to DB)
    2- get order (id of the order) return order object
    3- edit order
    4- cancel order (id of the order as parameter)
    id (counter) admin controlled
    db -- it will be hashmap with id as key.
     */
    private Integer iD = 0;
    private DataBase dataBase;
    private Menu menu;
    private Receipt receipt;

    public Order(){
        receipt = new Receipt();
    }

    public void requestOrder(int sandwichQuantity, Sandwich sandwich) {


    }
}
