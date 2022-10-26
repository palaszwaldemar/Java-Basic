package fundamenty;//Zadanie 17

import java.util.Scanner;

public class Haslo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hasloPrawidlowe = 87325655;
        System.out.print("\nAby wyswietlic komunikat podaj haslo: ");
        int hasloWprowadzane = scanner.nextInt();

        while (hasloWprowadzane != hasloPrawidlowe) {
            System.out.print("fundamenty.Haslo nieprawidlowe. Podaj haslo jeszcze raz: ");
            hasloWprowadzane = scanner.nextInt();
        }
        System.out.println();
        System.out.println("fundamenty.Haslo poprawne. Witaj w programie!");
    }
}
