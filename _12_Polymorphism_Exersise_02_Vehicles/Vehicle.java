package _12_Polymorphism_Exersise_02_Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setTankCapacity(tankCapacity);
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);

     //   setFuelQuantity(fuelQuantity);
     //   setFuelConsumption(fuelConsumption);
     //   setTankCapacity(tankCapacity);
    }

    private void setTankCapacity(double tankCapacity){
        this.tankCapacity = tankCapacity;
    };

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelQuantity(double fuelQuantity) {
            this.fuelQuantity = fuelQuantity;
        }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void refuel(double liters) {

       double newFuelQuantity = this.fuelQuantity + liters;
        if(liters <= 0 || newFuelQuantity <= 0){
           throw new IllegalArgumentException("Fuel must be a positive number");
       }
       if(newFuelQuantity > this.tankCapacity){
           throw new IllegalArgumentException("Cannot fit fuel in tank");
       }

        this.fuelQuantity += liters;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * getFuelConsumption();
        if (this.getFuelQuantity() >= fuelNeeded) {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
        }
            return this.getClass().getSimpleName() + " needs refueling";
    }
}
