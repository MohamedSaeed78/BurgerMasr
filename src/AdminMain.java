import app.*;

import java.util.Scanner;

public class AdminMain {

    public static void getAdminFeature(int input,Menu menu){
        AdminFeatures viewMenu = AdminFeatures.VIEW_MENU;
        switch (viewMenu){
            case VIEW_MENU -> menu.viewMenu();
            case VIEW_ADDITIONS -> menu.getAdditionsList();
//            case ADD_NEW_ITEM -> menu.addSandwich();
        }
    }
    public static void main(String[] args) {
        //creating instance of Menu
        Menu menu = Menu.getInstance();
        //creating sandwiches
        Sandwich beefBurger = new BeefBurger("Beef Burger",80);
        Sandwich chickenBurger = new ChickenBurger("Beef Burger",80);
        Sandwich cheeseBurger = new CheeseBurger("Beef Burger",80);
        //creating additions
        Addition catchup = new Addition("Catchup",10);
        Addition mayonnaise = new Addition("Mayonnaise",10);
        Addition tomatoes = new Addition("Tomatoes",5);
        Addition cheese = new Addition("Cheese",10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("1- View Menu");
        System.out.println("2- View Additions");
        System.out.println("3- Add New Item To Menu");
        System.out.println("3- Add new Addition");

        menu.addSandwich(chickenBurger);
        menu.addSandwich(cheeseBurger);
        menu.addAddition(mayonnaise);
        menu.addAddition(tomatoes);
        menu.addAddition(cheese);

        int i=scanner.nextInt();
        if (i == 1) {
            menu.viewMenu();
        } else if (i == 2) {
            menu.getAdditionsList();
        } else if (i == 3) {
            menu.addSandwich(beefBurger);
        } else if (i == 4) {
            menu.addAddition(catchup);
        }


    }
    public enum AdminFeatures {
        VIEW_MENU(1),
        VIEW_ADDITIONS(2),
        ADD_NEW_ITEM(3),
        ADD_NEW_ADDITION(4);
        int val;

        AdminFeatures(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }
}
