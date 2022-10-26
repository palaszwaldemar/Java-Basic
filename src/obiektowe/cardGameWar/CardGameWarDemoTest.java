package obiektowe.cardGameWar;

public class CardGameWarDemoTest {
    public static void main(String[] args) {
        Player player1 = new Player("Waldemar");
        Player player2 = new Player("Justyna");

        CardGameWar game = new CardGameWar(player1, player2);
        System.out.println("Info o grze:");
        System.out.println(game);
        System.out.println("Rozmiar talii kart:");
        System.out.println(game.getDeck().size());
        game.shuffleCards(game.getDeck());
        System.out.println("----------");
        System.out.println("Wyglad talii po pzetasowaniu:");
        System.out.println(game.getDeck());
        System.out.println("Rozmiar talii kart po przetasowaniu");
        System.out.println(game.getDeck().size());
        System.out.println("----------");
        game.dealCards();
        System.out.println("Karty gracza 1 po przetasowaniu");
        System.out.println(player1.getHandDeck());
        System.out.println("Rozmiar talii gracza 1 po przetasowaniu");
        System.out.println(player1.getHandDeck().size());
        System.out.println("Karty gracza 2 po przetasowaniu");
        System.out.println(player2.getHandDeck());
        System.out.println("Rozmiar talii gracza 1 po przetasowaniu");
        System.out.println(player2.getHandDeck().size());
        System.out.println("----------");
        System.out.println("Informacja czy karty nie powtarzaja sie u graczy(czyli czy dobrze rozdano karty)");
        game.checkIfPlayersHaveDifferentCards();
        System.out.println("----------");
        System.out.println("Talia na stole po rozdaniu kart:");
        System.out.println(game.getDeck());

        System.out.println("----------");
        int liczbagier = 1;
        do {
            System.out.println(liczbagier);
            game.fight();
            liczbagier++;
        } while (player2.getHandDeck().isEmpty());
        System.out.println("Talia gracza 1:   ");
        System.out.println(player1.getHandDeck());
        System.out.println("Liczba kart gracza 1");
        System.out.println(player1.getHandDeck().size());
        System.out.println("Talia gracza 2:");
        System.out.println(player2.getHandDeck());
        System.out.println("Liczba kart gracza 2");
        System.out.println(player2.getHandDeck().size());
        System.out.println("Talia na stole");
        System.out.println(game.getDeck());
        System.out.println("----------");
        System.out.println(game.win());
    }
}
