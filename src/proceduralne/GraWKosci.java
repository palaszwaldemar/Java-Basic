package proceduralne;

import java.util.Random;
import java.util.Scanner;

public class GraWKosci {

    private static int[] sumaPunktowGraczy = new int[2];

    private static final int PUNKTY_DO_ZDOBYCIA = 100;
    private static final int GRACZ_1 = 0;
    private static final int GRACZ_2 = 1;

    public static void main(String[] args) {
        System.out.println("\nGRA W KOSCI\n");
        int poprzedniGracz;
        int aktualnyGracz = GRACZ_1;
        do {
            poprzedniGracz = aktualnyGracz;
            wykonajTureGracza2(aktualnyGracz);
            aktualnyGracz= dajNumerKolejnegoGracza(aktualnyGracz);
        } while (sumaPunktowGraczy[poprzedniGracz] < PUNKTY_DO_ZDOBYCIA );
        wyswietlWynikKonfrontacji();
    }

    private static int dajNumerKolejnegoGracza(int aktualnyGracz) {
        if (aktualnyGracz == GRACZ_1) {
            return GRACZ_2;
        } else {
            return GRACZ_1;
        }
    }


    private static void wykonajTureGracza(int nrGracza) {
        String decyzjaORzucie;
        int sumaPunktowWObiegu = 0;
        int wynikRzutu = 0;
        do {
            System.out.println("\nGRACZ " + (nrGracza + 1));
            System.out.println("Suma punktow: " + sumaPunktowGraczy[nrGracza]);
            System.out.print("Czy chcesz grac? [t/n]: ");
            Scanner scanner = new Scanner(System.in);
            decyzjaORzucie = scanner.next();
            if (decyzjaORzucie.equals("t")) {
                wynikRzutu = rzucKoscmi();
                if (wynikRzutu!=0) {
                    sumaPunktowWObiegu +=wynikRzutu;
                    System.out.println("Suma punktow w obiegu: " + sumaPunktowWObiegu);
                } else {
                    System.out.println("Niestety na jednej z kosci wypadlo 1.");
                    System.out.println("Suma punktow: " + sumaPunktowGraczy[nrGracza]);
                    decyzjaORzucie = "n";
                }
            } else {
                sumaPunktowGraczy[nrGracza] += sumaPunktowWObiegu;
                System.out.println("Suma punktow: " + sumaPunktowGraczy[nrGracza]);
            }
        } while (decyzjaORzucie.equals("t"));
    }

    private static void wykonajTureGracza2(int nrGracza) {
        String decyzjaORzucie;
        int sumaPunktowWObiegu = 0;
        int wynikRzutu = 0;
        do {
            System.out.println("\nGRACZ " + (nrGracza + 1));
            System.out.println("Suma punktow: " + sumaPunktowGraczy[nrGracza]);
            System.out.println("Punkty z danej rundy: " + sumaPunktowWObiegu);
            System.out.print("Czy chcesz grac? [t/n]: ");
            Scanner scanner = new Scanner(System.in);
            decyzjaORzucie = scanner.next();
            if (decyzjaORzucie.equals("n")) {
                break;
            }
            wynikRzutu = rzucKoscmi();
            if (wynikRzutu == 0) {
                System.out.println("Wypadło 1! Nic nie wygrałeś, tura następnego gracza");
                return;
            }
            sumaPunktowWObiegu +=wynikRzutu;
        } while (decyzjaORzucie.equals("t"));
        sumaPunktowGraczy[nrGracza] += sumaPunktowWObiegu;
    }



    static int wykonajRzutKoscia() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    static int rzucKoscmi() {
        int kosc1 = wykonajRzutKoscia();
        int kosc2 = wykonajRzutKoscia();
        wyswieltWynikRzutuKoscmi(kosc1, kosc2);
        if (czyRozneOd1(kosc1, kosc2)) {
            return kosc1+kosc2;
        }
        return 0;
    }

    static boolean czyRozneOd1(int kosc1, int kosc2) {
        return kosc1 != 1 && kosc2 != 1;
    }

    static void wyswieltWynikRzutuKoscmi(int kosc1, int kosc2) {
        System.out.println("Kostka 1: " + kosc1 + "\t\t Kostka 2: " + kosc2);
    }


    static void wyswietlWynikKonfrontacji() {
        if (sumaPunktowGraczy[0] > sumaPunktowGraczy[1]) {
            System.out.println("\n\nWygral GRACZ 1");
        } else {
            System.out.println("\n\nWygral GRACZ 2");
        }
    }
}
