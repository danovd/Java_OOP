package _04_Abstraction_Exersise_01_and_02_and_03_Card_Suit;

public enum RankPowers {
    ACE (14), TWO (2), THREE (3), FOUR (4), FIVE (5), SIX (6), SEVEN (7), EIGHT (8), NINE (9),
    TEN (10), JACK (11), QUEEN (12), KING (13);

    int rankPower;

    RankPowers(int rankPower){
        this.rankPower = rankPower;
    }
    public int getRankPower(){
        return this.rankPower;
    }
}
