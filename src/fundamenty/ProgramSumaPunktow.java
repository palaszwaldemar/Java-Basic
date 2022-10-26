package fundamenty;//Zadanie 15

import java.util.Scanner;

public class ProgramSumaPunktow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWprowadzaj uzyskane punkty czastkowe. Aby zakonczyc wpisz -1. Policze dla ciebie ich " +
                "sume");
        int liczba = 0;
        int suma = 1;

        while (liczba != -1) {
            System.out.print("\nWprowadz liczbe: ");
            liczba = scanner.nextInt();
            suma += liczba;
        }

        System.out.println("\nSuma wynosi: " + suma);
    }
}
