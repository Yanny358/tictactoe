package pp;
import java.util.ArrayList;

public class CardGame {

    public static void main(String[] args) {

        CardDeck mCardDeck = new CardDeck();

        mCardDeck.shuffle();

        CardHand hand = new CardHand(mCardDeck);

        hand.showHand();

        System.out.println(hand.pair());



    }
}
