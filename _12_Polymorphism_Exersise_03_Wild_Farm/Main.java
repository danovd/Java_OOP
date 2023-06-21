package _12_Polymorphism_Exersise_03_Wild_Farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] animalData = sc.nextLine().split("\\s+");

List<Animal> animals = new ArrayList<>();
        while(!animalData[0].equals("End")) {

            Animal animal = createNewAnimal(animalData);

            String [] foodData = sc.nextLine().split("\\s+");
            Food food = createFood(foodData);

                animal.makeSound();
                   try {
                       animal.eat(food);
                   }catch (IllegalArgumentException e){
                       System.out.println(e.getMessage());
                   }


            animals.add(animal);
            animalData = sc.nextLine().split("\\s+");
        }

animals.forEach(System.out::println);


    }

    private static Food createFood(String[] foodData) {
        String foodType = foodData[0];
        Integer foodQuantity = Integer.parseInt(foodData[1]);

        if (foodType.equals("Meat")) {
            return new Meat(foodQuantity);
        } else if (foodType.equals("Vegetable")) {
            return new Vegetable(foodQuantity);
        } else {
            throw new IllegalArgumentException("No such food");
        }
    }

    private static Animal createNewAnimal(String[] animalData) {
        String type = animalData[0];
        String name = animalData[1];
        double weight = Double.parseDouble(animalData[2]);
        String livingRegion = animalData[3];
        String catBreed = "";

        if (type.equals("Cat")) {
            catBreed = animalData[4];
            return new Cat(type, name, weight, livingRegion, catBreed);
        } else if (type.equals("Mouse")) {
            return new Mouse(type, name, weight, livingRegion);
        } else if (type.equals("Tiger")) {
            return new Tiger(type, name, weight, livingRegion);
        } else if (type.equals("Zebra")) {
            return new Zebra(type, name, weight, livingRegion);
        } else {
            throw new IllegalArgumentException("No such animal");
        }
    }
}
