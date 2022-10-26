package fundamenty;//Zadanie 10 wariant trudniejszy wersja 2

import java.util.Random;
import java.util.Scanner;

public class Kostka3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(5,11));
        }
        System.out.println("-------------------");

        System.out.print("\nPodaj najmniejsza wartosc losowania: ");
        int najmniejszaWartosc = scanner.nextInt();
        System.out.print("Podaj najwieksza wartosc losowania: ");
        int najwiekszaWartosc = scanner.nextInt();

        System.out.println("Wylosowane liczby z zakresu miedzy " + najmniejszaWartosc + " a " + najwiekszaWartosc);

        for (int i = 1; i <= 15; i++) {
            int wylosowana = random.nextInt(najwiekszaWartosc - najmniejszaWartosc + 1) + najmniejszaWartosc;


            //   50 - 150
            //    nextInt(101)+50    -> 50-149
            System.out.println(wylosowana);
        }
    }
}
