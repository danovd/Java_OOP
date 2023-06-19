package _08_Inheritance_Exersise_05_Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double milliliters;
    Beverage(String name, BigDecimal price, double milliliters){
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {

        return milliliters;
    }
}
