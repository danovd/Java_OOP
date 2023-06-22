package _17_Exceptions;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    private void setAge(int age) {
        if(age < 0 || age >120){
            throw new IllegalArgumentException("Age should be in the range [0...120]");
        }
        this.age = age;
    }

    private void setFirstName(String firstName) {
        if(StringUtils.isNullOrEmpty(firstName)){
            throw new IllegalArgumentException("The first name cannot be null or empty!");
        }
        this.firstName = firstName;
    }
    private void setLastName(String lastName) {
        if(StringUtils.isNullOrEmpty(lastName)){
            throw new IllegalArgumentException("The last name cannot be null or empty!");
        }
        this.firstName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
