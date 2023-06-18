package _06_Encapsulation_Exersise_03_Shopping_Spree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
       setName(name);
       setCost(cost);
    }

    private void setCost(double cost) {
        if(cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
