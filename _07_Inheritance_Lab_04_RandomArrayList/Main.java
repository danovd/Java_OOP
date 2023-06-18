package _07_Inheritance_Lab_04_RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<String> strings = new RandomArrayList<>();

        strings.add("one");
        strings.add("two");
        strings.add("three");

        String any = strings.getRandomElement();
      //  System.out.println(any);
    }
}
