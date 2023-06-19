package _08_Inheritance_Exersise_06_Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        while(!type.equals("Beast!")){
            String [] animalInfo = sc.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
            Animal animal = null;
                switch (type) {
                    case "Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                }
                printAnimal(animal);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            type = sc.nextLine();
        }


    }
    public static void printAnimal(Animal a){
        System.out.println(a);
    }
}
