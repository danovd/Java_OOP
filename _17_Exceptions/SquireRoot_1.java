package _17_Exceptions;

import java.util.Scanner;

public class SquireRoot_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try{
        double sqrt = sqrt(sc);
        System.out.println(sqrt);
    }catch (NumberFormatException e){
        System.out.println(e.getMessage());
    }finally {
        System.out.println("Good bye");
    }


    }

    public static double sqrt(Scanner sc){
        String str = sc.nextLine();

        for(char symbol : str.toCharArray()){
            if(!Character.isDigit(symbol)){
                throw new NumberFormatException("Invalid number");
            }
        }
        return Math.sqrt(Integer.parseInt(str));
    }

}
