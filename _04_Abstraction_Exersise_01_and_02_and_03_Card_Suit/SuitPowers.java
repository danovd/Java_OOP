package _04_Abstraction_Exersise_01_and_02_and_03_Card_Suit;

public enum SuitPowers {
    CLUBS (0), DIAMONDS (13), HEARTS (26), SPADES (39);

    int suitPower;

    SuitPowers(int suitPower){
        this.suitPower = suitPower;
    }
    public int getSuitPower(){
        return this.suitPower;
    }

}
