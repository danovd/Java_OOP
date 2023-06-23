package HoteL_Reservation;

public class PriceCalculator {

    public static double CalculatePrice(double pricePerDay,

                                        int numberOfDays, Season season, Discount discount) {

        int multiplier = season.getValue();

        double discountMultiplier = discount.getValue() / 100.0;

       double priceBeforeDiscount = numberOfDays * pricePerDay * multiplier;

       double discountedAmount = priceBeforeDiscount * discountMultiplier;

       return priceBeforeDiscount - discountedAmount;

    }

}
