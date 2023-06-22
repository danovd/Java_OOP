package _17_Exceptions;

import java.util.Scanner;

public class Fixing_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            int dayAsNumber;
            try {
                dayAsNumber = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("Invalid number input, please enter number in between [1...7]");
                continue;
            }
            System.out.println("Hello, today is " + gatWeekDay(dayAsNumber));
        }
        }

    public static String gatWeekDay(int dayNumber){
        return switch(dayNumber){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Unknown day of week " + dayNumber);
        };
    }

}
