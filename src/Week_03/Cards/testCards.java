package Week_03.Cards;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Khrolenko on 11.03.2017.
 */
public class testCards {

   private static Deck deck = new Deck();
   public static void printCards(){

        for (int i = 0; i < deck.cards.length; i++){
            System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
        }
    }

    public static void main(String[] args) {
        printCards();

//        System.out.println("---------after shuffle----------");
//        deck.shuffle();
//        printCards();
//
//        System.out.println("---------after sorting----------");
//        deck.order();
//        printCards();

        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < deck.cards.length; i++){
            Card card = deck.drawOne();
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
            System.out.println(deck.hasNext());
            System.out.println(deck.cardsUsed);
        }
    }
}
