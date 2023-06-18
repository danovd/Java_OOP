package _06_Encapsulation_Exersise_04_Pizza_Calories;

public class Main {
    public static void main(String[] args) {

        ///  Има много неточности в условието!!!


        try {
            Dough d = new Dough(FlourType.White.name(), "sds", 100);
            System.out.println(d.calculateCalories());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
