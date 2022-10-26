package obiektowe.cardGameWar;

public class CardGameWarDemo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("GRA KARCIANA WOJNA");
        Player player1 = new Player("Waldemar");
        Player player2 = new Player("Justyna");
        System.out.println("Nazwa gracza 1: " + player1.getPlayerName());
        System.out.println("Nazwa gracza 2: " + player2.getPlayerName());
        System.out.println("\n----------\n");
        CardGameWar game = new CardGameWar(player1, player2);
        System.out.println("Tasowanie talii...\n");
        game.shuffleCards(game.getDeck());
        System.out.println("Rozdajemy karty...\n");
        System.out.println("ROZPOCZYNAMY GRE!");
        System.out.println("\n----------\n");
        game.dealCards();
        game.fight();
        System.out.println("\n----------\n");
        System.out.println("GRE WYGRYWA GRACZ: " + game.win());
    }
}
