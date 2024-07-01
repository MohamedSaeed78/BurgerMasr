import app.*;

import java.util.Scanner;

public class AdminMain {

    public static void getAdminFeature(int input,Menu menu){
        AdminFeatures viewMenu = AdminFeatures.VIEW_MENU;
        switch (viewMenu){
//            case VIEW_MENU -> menu.viewMenu();
//            case VIEW_ADDITIONS -> menu.getAdditionsList();
//            case ADD_NEW_ITEM -> menu.addSandwich();
        }
    }
    public void startAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- View Menu");
        System.out.println("2- View Additions");
        System.out.println("3- Add New Item To Menu");
        System.out.println("3- Add new Addition");

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
