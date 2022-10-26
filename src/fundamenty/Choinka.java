package fundamenty;//Zadanie 27

import java.util.Scanner;

public class Choinka {
    public static void main(String[] args) {
        System.out.println("\nProgram rysujacy choinke\n");
        int wysokosc;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj wysokosc choinki: ");
            wysokosc = scanner.nextInt();

            if (wysokosc < 1) {
                System.out.println("Podana wysokosc jest nieprawidlowa\n");
            }
        } while (wysokosc < 1);
        System.out.println();

        int iloscPustychMiejscWLinii = wysokosc - 1;
        int iloscGwiazdekWOstatniejLinii = (wysokosc * 2) - 1;

        for (int i = 1; i <= iloscGwiazdekWOstatniejLinii; i += 2) {
            for (int j = iloscPustychMiejscWLinii; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            iloscPustychMiejscWLinii--;
            System.out.println();
        }
    }
}
