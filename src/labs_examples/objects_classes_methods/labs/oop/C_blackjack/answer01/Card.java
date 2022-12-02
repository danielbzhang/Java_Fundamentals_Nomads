package labs_examples.objects_classes_methods.labs.oop.C_blackjack.answer01;

public class Card {
    private int scoreValue;
//    private char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private char suit;
    private String value;

    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String customToString() {
        return suit + value + suit;
    }

    public int getScoreValue() {
        try {
            return Integer.valueOf(value);
        } catch (Exception e) {
            if(value.equalsIgnoreCase("ACE")) {
                return 11;
            } else {
                return 10;
            }
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "scoreValue=" + scoreValue +
                ", suit=" + suit +
                ", value='" + value + '\'' +
                '}';
    }
}
