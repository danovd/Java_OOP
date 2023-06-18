package _08_Inheritance_Exersise_01_Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        Child child = new Child(name, age);
        Person person = new Person(name, age);
        System.out.println(child.getName());
        System.out.println(child.getAge());

    }



}
