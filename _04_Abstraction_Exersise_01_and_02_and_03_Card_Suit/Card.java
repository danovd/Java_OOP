package _04_Abstraction_Exersise_01_and_02_and_03_Card_Suit;

public class Card {

    private RankPowers rankPower;
    private SuitPowers suitPower;

    public Card(RankPowers rankPower, SuitPowers suitPower){
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }
    public int getPower(){
        return rankPower.getRankPower() + suitPower.getSuitPower();
    }

}
