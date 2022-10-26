package fundamenty;//Zadanie 26

import java.util.Scanner;

public class WypelnionyKwadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWprowadz znak wypelnienia prostokata: ");
        String znak = scanner.next();

        System.out.print("Wprowadz wysokosc prostokata: ");
        int wysokosc = scanner.nextInt();

        System.out.print("Wprowadz szerokosc prostokata: ");
        int szerokosc = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 1; j <= szerokosc; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
