package obiektowe.cards;

import java.util.ArrayList;

public class CardDemo {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.DWOJKA, Suit.TREFL);
        Card card2 = new Card(Rank.DZIESIATKA, Suit.KARO);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println("-----------------");

        for (Rank rank : Rank.values()) {
            System.out.print(rank + " ");
        }
        System.out.println("-----------------");
        System.out.println(card1.getStrength());
        System.out.println(card2.getStrength());
        System.out.println("-----------------");
        Card.compareTwoCards(card1, card2);

        ArrayList<Card> oneColorCards = new ArrayList<>();

        for (Rank rank : Rank.values()) {
            oneColorCards.add(new Card(rank, Suit.PIK));
        }

        System.out.println("------------------");
        System.out.println(oneColorCards);

        ArrayList<Card> allCards = new ArrayList<>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                allCards.add(new Card(rank, suit));
            }
        }

        System.out.println("-------------------");
        System.out.println(allCards);
    }
}