package _04_Abstraction_Exersise_01_and_02_and_03_Card_Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //    Задача 1 -ва:
    //    System.out.println("Card Suits: ");
    //    for(CardSuit card : CardSuit.values()){
    //        System.out.printf("Ordinal value: %d; Name value: %s\n", card.ordinal(), card.name());
    //    }

    //  Задача 2- ра
    //    System.out.println("Card Ranks: ");
    //        for(CardRanks card : CardRanks.values()){
    //            System.out.printf("Ordinal value: %d; Name value: %s\n", card.ordinal(), card.name());
    //        }

    //    Задача 3-та
        Scanner sc = new Scanner(System.in);
    RankPowers rankPower = RankPowers.valueOf(sc.nextLine());
    SuitPowers suitPower = SuitPowers.valueOf(sc.nextLine());

    Card card = new Card(rankPower, suitPower);
        System.out.printf("Card name: %s of %s; Card power: %d",
                rankPower, suitPower, card.getPower());

    }
}
