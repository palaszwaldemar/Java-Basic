package obiektowe.cardGameWar;

import obiektowe.cards.Card;
import obiektowe.cards.Rank;
import obiektowe.cards.Suit;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardGameWar {
    private final Player player1;
    private final Player player2;
    private final ArrayList<Card> deck = new ArrayList<>();
    private int turnCounterToShufflePlayerCards = 10;

    public CardGameWar(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                this.deck.add(new Card(rank, suit));
            }
        }
    }

    void shuffleCards(ArrayList<Card> cards) {
        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int indexOfRandomCard = random.nextInt(cards.size());
            Card card = cards.get(i);
            Card randomCard = cards.get(indexOfRandomCard);
            cards.set(i, randomCard);
            cards.set(indexOfRandomCard, card);
        }
    }

    void dealCards() {
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                player1.addCardToHandDeck(deck.get(i));
            } else {
                player2.addCardToHandDeck(deck.get(i));
            }
        }
        deck.clear();
    }

    void checkIfPlayersHaveDifferentCards() {
        for (int i = 0; i < player1.getHandDeck().size(); i++) {
            for (int j = 0; j < player2.getHandDeck().size(); j++) {
                if (player1.getHandDeck().get(i) == player2.getHandDeck().get(j)) {
                    System.out.println("Blad!");
                    break;
                }
            }
        }
        System.out.println("OK");
    }

    void fight() {
        while (!(player1.getHandDeck().isEmpty()) && !(player2.getHandDeck().isEmpty())) {
            do {
                putCardsForCompare();
            } while (deck.get(0).getStrength() == deck.get(1).getStrength());
            addAllCardsToWinPlayer();
            turnCounterToShufflePlayerCards--;
            if(turnCounterToShufflePlayerCards == 0) {
                System.out.println("Przetasowanie talii graczy...");
                shuffleCards(player1.getHandDeck());
                shuffleCards(player2.getHandDeck());
                turnCounterToShufflePlayerCards = 10;
            }
        }
    }

    void putCardsForCompare() {
        Card removedCard1 = player1.getHandDeck().remove(0);
        System.out.println("Gracz " + player1.getPlayerName() + " wyklada karte " + removedCard1);
        deck.add(0,removedCard1 );
        //player1.getHandDeck().remove(0);
        System.out.println("Gracz " + player2.getPlayerName() + " wyklada karte " + player2.getHandDeck().get(0));
        deck.add(0, player2.getHandDeck().get(0));
        player2.getHandDeck().remove(0);
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
    }

    void addAllCardsToWinPlayer() {
        Player winner;
        if (deck.get(0).getStrength() > deck.get(1).getStrength()) {
            winner = player2;
            System.out.println("Ture wygrywa gracz 2");
        } else {
            winner = player1;
            System.out.println("Ture wygrywa gracz 1");
        }
        winner.getHandDeck().addAll(deck);
        System.out.println("Zwyciezca zabiera karty: "+ deck + "\n");
        deck.clear();
    }

    String win() {
        if (player1.getHandDeck().isEmpty()) {
            return player2.getPlayerName();
        } else {
            return player1.getPlayerName();
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    @Override
    public String toString() {
        return "CardGameWar{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", deck=" + deck +
                '}';
    }
}
