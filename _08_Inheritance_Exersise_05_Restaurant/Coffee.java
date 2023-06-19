package _08_Inheritance_Exersise_05_Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private static final double COFFEE_MILLILITERS = 50;
    private static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    private final double caffeine;

    public double getCaffeine() {

        return caffeine;
    }

    Coffee(String name, double caffeine) {

        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }
}
