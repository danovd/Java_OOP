package _10_Interfaces_And_Abstraction_Exersise_01_to_04;

public class Pet implements Birthable{
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    public String getName() {
        return this.name;
    }
}
