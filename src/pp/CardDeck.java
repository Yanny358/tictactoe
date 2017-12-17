package pp;
import java.util.ArrayList;
import java.util.Collections;


public class CardDeck {

    ArrayList<Card> mCardDeck;

    public CardDeck() {

        mCardDeck = new ArrayList<>();

        for (CardRank rank : CardRank.values()) {

            for (CardSuit suit : CardSuit.values()) {

                mCardDeck.add(new Card(rank, suit));

            }
        }
    }


    public void shuffle() {
        Collections.shuffle(mCardDeck);
    }

    public Card getCard() {
        return mCardDeck.remove(0);
    }
}
