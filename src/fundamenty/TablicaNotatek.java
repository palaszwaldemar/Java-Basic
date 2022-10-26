package fundamenty;//Zadanie 22

import java.util.Scanner;
import java.util.Random;

public class TablicaNotatek {
    public static void main(String[] args) {
        int iloscNotatek;
        int numerNotatki;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("\nIle notatek bedzie potrzebnych?: ");
        iloscNotatek = scanner.nextInt();
        String[] tablicaNotatek = new String[iloscNotatek];

        for (int i = 0; i < tablicaNotatek.length; i++) {
            System.out.print("Podaj " + (i + 1) + " notatke: ");
            tablicaNotatek[i] = scanner.next();
        }
        System.out.println();

        for (String notatka : tablicaNotatek) {
            System.out.print(notatka + " ");
        }

        numerNotatki = random.nextInt(iloscNotatek - 1);

        System.out.print("\n\nWylosowana notatka: \n" + tablicaNotatek[numerNotatki]);
    }
}
