package pp;

public enum CardSuit {

    DIAMONDS,
    HEARTS,
    CLUBS,
    SPADES;

    @Override
    public String toString() {

        char suit = '?';

        switch (this) {
            case DIAMONDS:
                suit = '♦';
                break;
            case CLUBS:
                suit = '♣';
                break;
            case SPADES:
                suit = '♠';
                break;
            case HEARTS:
                suit = '♥';
                break;
        }

        return String.valueOf(suit);
    }
}