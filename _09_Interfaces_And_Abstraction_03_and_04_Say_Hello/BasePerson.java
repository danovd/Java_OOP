package _09_Interfaces_And_Abstraction_03_and_04_Say_Hello;

public abstract class BasePerson implements Person{
    private String name;

    public BasePerson(String name) {
        setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }




    @Override
    public String sayHello() {
        return super.toString();
    }
}
