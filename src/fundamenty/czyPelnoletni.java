package fundamenty;//Zadanie 9

import java.util.Scanner;

public class czyPelnoletni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCzesc, jak masz na imie?");
        String imie = scanner.next();
        System.out.println("Jak masz na nazwisko?");
        String nazwisko = scanner.next();
        System.out.println("Witaj " + imie + " " + nazwisko + "! Prosze podaj jeszcze swoj wiek:");
        int wiek = scanner.nextInt();

        if (wiek <= 0 || wiek > 100) {
            System.out.println("Chyba podales niepoprawnny wiek");
            return;
        }
        boolean czyPelnoletniaOsoba = wiek >= 18;

        System.out.println("Juz wiem czy jestes pelnoletni: " + czyPelnoletniaOsoba);
        if (wiek < 16) {
            System.out.println("Jestes dzieckiem");
        } else if (wiek < 22) {
            System.out.println("Jestes nastolatkiem");
        } else if (wiek < 62) {
            System.out.println("Jestes osoba dorosla");
        } else {
            System.out.println("Osiagnales wiek emerytalny");
        }
    }
}
