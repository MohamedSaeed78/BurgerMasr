package app;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static Menu instance = null;
    private List<Sandwich> sandwichList;
    private List<Addition> additionsList;

    public List<Sandwich> getSandwichList() {
        return sandwichList;
    }

    public List<Addition> getAdditionsList() {
        return additionsList;
    }

    public void setSandwichList(List<Sandwich> sandwichList) {
        this.sandwichList = sandwichList;
    }

    public void setAdditionsList(List<Addition> additionsList) {
        this.additionsList = additionsList;
    }

    private Menu(){
        sandwichList = new ArrayList<Sandwich>();
        additionsList = new ArrayList<Addition>();
    }
    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }

    public void addSandwich(Sandwich sandwich){
        boolean inMenu=false;
        for(Sandwich sandwichI : sandwichList){
            if(sandwich.name.equals(sandwichI.name)){
                System.out.println("Sandwich already in menu");
                inMenu = true;
            }
        }
        if (inMenu=false){
            sandwichList.add(sandwich);
            System.out.println("Sandwich added successfully");
        }
    }
    public void addAddition(Addition addition){
        boolean inMenu=false;
        for(Addition addition1:additionsList){
            if(addition.name.equals(addition1.name)){
                System.out.println("Addition already in menu");
                inMenu = true;
            }
        }
        if (inMenu=false){
            sandwichList.add(addition);
            System.out.println("Addition added successfully");
        }
    }
    public void viewMenu(){
        int count=1;
        for (Sandwich sandwich:sandwichList){
            System.out.println(count + "." + sandwich.name);
            count++;
        }
    }
}
