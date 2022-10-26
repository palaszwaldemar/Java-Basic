package fundamenty;//Zadanie 28

import java.util.Scanner;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        System.out.println("\nSortowanie elementow podanych przez uzytkownika\n");
        System.out.print("Podaj ile elementow chcesz posortowac: ");

        Scanner scanner = new Scanner(System.in);
        int liczbaElementow = scanner.nextInt();

        System.out.println();

        int[] tab = new int[liczbaElementow];

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe: ");
            tab[i] = scanner.nextInt();
        }

        System.out.println("\nLiczby przed sortowaniem:");
        for (int liczby : tab) {
            System.out.print(liczby + " ");
        }
        System.out.println();

        for (int i = 0; i < (tab.length - 1); i++) {
            for (int j = 0; j < (tab.length - 1); j++) {
                if (tab[j] > tab[j +1]) {
                    int miejsceTymczasowe = tab[j];
                    tab[j] = tab[j + 1];
                    tab [j + 1] = miejsceTymczasowe;
                }
            }
        }

        System.out.println("\nLiczby po sortowaniu:");
        for (int liczby : tab) {
            System.out.print(liczby + " ");
        }
    }
}
