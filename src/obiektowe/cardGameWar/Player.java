package obiektowe.cardGameWar;

import obiektowe.cards.Card;

import java.util.ArrayList;

public class Player {
    private final String playerName;
    private final ArrayList<Card> handDeck = new ArrayList<>();

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Card> getHandDeck() {
        return handDeck;
    }

    public void addCardToHandDeck (Card card) {
        this.handDeck.add(card);
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", handDeck=" + handDeck +
                '}';
    }
}
