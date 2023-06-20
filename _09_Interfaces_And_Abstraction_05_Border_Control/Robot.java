package _09_Interfaces_And_Abstraction_05_Border_Control;

public class Robot implements Identifiable{
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }
    public String getModel(){
        return this.model;
    }
    @Override
    public String getId() {
        return this.id;
    }
}
