package app;

public class Menu {
    private static Menu instance = null;
    private DataBase dataBase;
    private Menu(){
        dataBase.getInstance();
    }
    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }

    public void addSandwich(Sandwich sandwich){
        boolean isExisting =false;
        for(Sandwich sandwichI : dataBase.getSandwichList()){
            if(sandwich.name.equals(sandwichI.name)){
                System.out.println("Sandwich already in menu");
                isExisting = true;
            }
        }
        if (isExisting =false){
            dataBase.getSandwichList().add(sandwich);
            System.out.println("Sandwich added successfully");
        }
    }
    public void addAddition(Addition addition){
        boolean isExisting =false;
        for(Addition addition1: dataBase.getAdditionsList()){
            if(addition.name.equals(addition1.name)){
                System.out.println("Addition already in menu");
                isExisting = true;
            }
        }
        if (isExisting =false){
            dataBase.getAdditionsList().add(addition);
            System.out.println("Addition added successfully");
        }
    }
    public void viewMenu(){
//        int count=1;
//        for (Sandwich sandwich:sandwichList){
//            System.out.println(count + "." + sandwich.name);
//            count++;
//        }
        for (int i = 0; i < dataBase.getSandwichList().size(); i++) {
            System.out.println((i+1) + "." + dataBase.getAdditionsList().get(i).getName());
        }
    }
}
