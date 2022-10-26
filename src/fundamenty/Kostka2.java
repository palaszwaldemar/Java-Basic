package fundamenty;//Zadanie 10 wariant trudniejszy

import java.util.Random;
import java.util.Scanner;

public class Kostka2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nPodaj najmniejsza wartosc losowania: ");
        int najmniejszaWartosc = scanner.nextInt();
        System.out.print("Podaj najwieksza wartosc losowania: ");
        int najwiekszaWartosc = scanner.nextInt();
        int iloscPowtorzenProgramu = 0;

        System.out.println("Wylosowane liczby z zakresu miedzy " + najmniejszaWartosc + " a " + najwiekszaWartosc);

        for (int i = 1; i <= 15; i++) {
            int wylosowana = random.nextInt(najwiekszaWartosc) + 1;
            if (wylosowana >= najmniejszaWartosc) {
                System.out.println(wylosowana);
                iloscPowtorzenProgramu++;
            } else {
                i--;
                iloscPowtorzenProgramu++;
            }
        }

        System.out.print("Ilosc powtorzen programu: " + iloscPowtorzenProgramu);
    }
}
