package _06_Encapsulation_Exersise_04_Pizza_Calories;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
Pizza(String name, int numberOfToppings){
    setName(name);
}

    private void setName(String name) {
    if(name.trim().isEmpty() || name.length() > 15){
        throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
    }
    this.name = name;
    }


}
