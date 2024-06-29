package app;

public class Sandwich {
    String name;
    double price;

    public Sandwich(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }
}
