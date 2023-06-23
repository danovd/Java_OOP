package HoteL_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input [0]);
        int numberOfDays = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];

       double result = PriceCalculator.CalculatePrice(pricePerDay, numberOfDays,
                Season.valueOf(season), Discount.valueOf(discountType));

        System.out.println(String.format("%.2f", result));
    }
}
