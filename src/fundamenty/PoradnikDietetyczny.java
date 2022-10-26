package fundamenty;//Zadanie 13

import java.util.Scanner;

public class PoradnikDietetyczny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wiek;
        int wzrost;
        int waga;

        System.out.print("\nPodaj wiek: ");
        wiek = scanner.nextInt();
        System.out.print("\nPodaj wzrost: ");
        wzrost = scanner.nextInt();
        System.out.print("\nPodaj wage: ");
        waga = scanner.nextInt();
        System.out.println();





        if (wiek > 120 && wzrost > 270 && waga > 170) {
            System.out.println("Nie udzielamy porad dla absurdalnch wartosci");
        } else if (wiek > 100) {
            System.out.println("Nie udzielamy porad ludziom starszym od 100 lat");
        } else if (wiek < 18) {
            System.out.println("Porady dla nieletnich opatrzone są specjalną klauzulą");
            if (wiek == 14 && waga > 100) {
                System.out.println("Ostre ostrzezenie!");
            } else if (wiek > 14 && waga < 40 && wzrost > 100) {
                System.out.println("Ostrzezenie anorekyczne!");
            }
        } else if (wiek > 18 && waga < 40 && wzrost > 100) {
            System.out.println("Ostrzeżenie anorektyczne dla osób > 14 lat, lżejszych niż 40kg i większych od 1m");
        }
    }
}