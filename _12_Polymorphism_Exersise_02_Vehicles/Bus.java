package _12_Polymorphism_Exersise_02_Vehicles;

public class Bus extends Vehicle{
    private boolean isEmpty;
    private static final double ADDITIONAL_CONSUMPTION = 1.4;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        isEmpty = false;
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        if(!this.isEmpty) {
            super.setFuelConsumption(fuelConsumption + ADDITIONAL_CONSUMPTION);
        }else{
            super.setFuelConsumption(fuelConsumption);
        }

    }
    public void setIsEmpty(boolean empty) {
        isEmpty = empty;
    }


}
