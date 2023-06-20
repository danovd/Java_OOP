package _09_Interfaces_And_Abstraction_03_and_04_Say_Hello;

public class European extends BasePerson{

    public European(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Hello";
    }
}
