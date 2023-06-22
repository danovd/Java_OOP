package _17_Exceptions;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EnterNumbers_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String start = sc.nextLine();
            String end = sc.nextLine();
            try{
                printNumberRange(start, end);
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printNumberRange(String start, String end) {
        int s;
        int e;
        try{
            s = Integer.parseInt(start);
            e = Integer.parseInt(end);
        }catch (NumberFormatException ex){
            throw new IllegalArgumentException("Invalid input, please enter new range.", ex);
            // e -> добавя инфо за stack trace за първоначалния exception
        }

        if(!(1 < s && s < e && e < 100)){
            throw new IllegalArgumentException("Invalid input, please enter new range.");
        }
        IntStream.rangeClosed(s, e)
                .forEach(System.out::println);
    }
}
