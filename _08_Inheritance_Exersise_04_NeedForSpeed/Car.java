package _08_Inheritance_Exersise_04_NeedForSpeed;

public class Car extends Vehicle{
    private static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }

}
