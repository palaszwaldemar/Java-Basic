package obiektowe.cards;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getStrength() {
        return rank.getStrength();
    }

    static void compareTwoCards(Card card1, Card card2) {
        if(card1.getStrength() > card2.getStrength()) {
            System.out.println(card1);
        } else {
            System.out.println(card2);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}
