package _09_Interfaces_And_Abstraction_06_Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private final String model = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return this.model + "/" + this.brakes() + "/" + this.gas() +"/" + this.driverName;
    }
}
