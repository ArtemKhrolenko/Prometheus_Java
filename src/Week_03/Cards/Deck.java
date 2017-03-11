package Week_03.Cards;

import java.util.ArrayList;

/**
 * Created by Khrolenko on 11.03.2017.
 */
public class Deck {

    public Card[] cards;
    public int cardsUsed = 0;

    public Deck() {
        cards = new Card[36];

        int cardCt = 0; // How many cards have been created so far.
        for ( int suit = 0; suit < Suit.values.length; suit++ ) {
            for ( int rank = 0; rank < Rank.values.length; rank++ ) {
                cards[cardCt] = new Card(Rank.values[rank], Suit.values[suit]);
                cardCt++;
            }
        }
    }


    // /Перемішує колоду у випадковому порядку
    public void shuffle() {

        for ( int i = cards.length - 1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
        cardsUsed = 0;

    }
    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {

        int cardCt = 0; // How many cards have been created so far.
        for ( int suit = 0; suit < Suit.values.length; suit++ ) {
            for ( int rank = 0; rank < Rank.values.length; rank++ ) {
                cards[cardCt].setRank(Rank.values[rank]);
                cards[cardCt].setSuit(Suit.values[suit]);
                cardCt++;
            }
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return cardsUsed < 36;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        ++cardsUsed;
        return cardsUsed > 36 ? null : cards[cards.length - cardsUsed];
    }


}
