package _12_Polymorphism_Exersise_03_Wild_Farm;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food f) {
        this.setFoodEaten(this.getFoodEaten() + f.getQuantity());
    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", getAnimalType(), getAnimalName(), this.breed,
                df.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
