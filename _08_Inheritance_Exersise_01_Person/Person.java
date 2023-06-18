package _08_Inheritance_Exersise_01_Person;

public class Person {
    private final String name;
    private final int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }
}
