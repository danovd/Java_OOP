package _12_Polymorphism_Exersise_03_Wild_Farm;

public abstract class Food {
    private int quantity = 0;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
