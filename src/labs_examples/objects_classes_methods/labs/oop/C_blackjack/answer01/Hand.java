package labs_examples.objects_classes_methods.labs.oop.C_blackjack.answer01;

import java.util.ArrayList;

public class Hand {
    private int handValue;
    private ArrayList<Card> card;

    public Hand(int handValue, ArrayList<Card> card) {
        this.handValue = handValue;
        this.card = card;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public ArrayList<Card> getCard() {
        return card;
    }

    public void setCard(ArrayList<Card> card) {
        this.card = card;
    }
}
