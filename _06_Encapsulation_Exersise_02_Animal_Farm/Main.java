package _06_Encapsulation_Exersise_02_Animal_Farm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
