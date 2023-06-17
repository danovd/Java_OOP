package _06_Encapsulation_Exersise_02_Animal_Farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setAge(int age) {
        if(age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private void setName(String name) {
        if(name.length() < 1 || name.charAt(0) == ' ' || name == null){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }
    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if(age < 6){
            return 2;
        }else if(age < 12){
            return 1;
        }
        return 0.75;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.\n",
                this.name, this.age, productPerDay());
    }
}
