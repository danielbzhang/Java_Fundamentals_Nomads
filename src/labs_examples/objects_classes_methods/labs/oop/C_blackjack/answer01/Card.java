package labs_examples.objects_classes_methods.labs.oop.C_blackjack.answer01;

public class Card {
    private int cardValue;
    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};

    public Card(int cardValue, char[] suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public char[] getSuit() {
        return suit;
    }

    public void setSuit(char[] suit) {
        this.suit = suit;
    }
}
