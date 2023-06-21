package _12_Polymorphism_Exersise_03_Wild_Farm;

public class Tiger extends Felime{
    private String livingRegion;

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food f) {
        if(f instanceof Vegetable ){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(f);
    }
}
