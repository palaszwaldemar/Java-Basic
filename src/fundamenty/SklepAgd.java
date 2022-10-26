package fundamenty;//Projekt 1: Sklep AGD

import java.util.Scanner;

public class SklepAgd {
    public static void main(String[] args) {
        System.out.println("\nProgram wyliczajacy wysokosc miesiecznej raty za zakupiony sprzet\n");

        Scanner scanner = new Scanner(System.in);
        int cenaTowaru;
        int liczbaRat;
        double kosztPozyczki;
        double miesiecznaRata;
        double procent;

        System.out.print("Podaj cene towaru [od 100 zl do 10 tys. zl]: ");
        cenaTowaru = scanner.nextInt();
        if (cenaTowaru < 100 || cenaTowaru > 10000) {
            System.out.println("Podana cena nie miesci sie w zakresie");
            return;
        }

        System.out.print("Podaj liczbe rat [od 6 do 48]: ");
        liczbaRat = scanner.nextInt();
        if (liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Podana liczba rat nie miesci sie w zakresie");
            return;
        }

        if (liczbaRat <= 12) {
            procent = 0.025;
        } else if (liczbaRat <= 24) {
            procent = 0.05;
        } else {
            procent = 0.1;
        }
        kosztPozyczki = cenaTowaru + (cenaTowaru * procent);
        miesiecznaRata = kosztPozyczki / liczbaRat;

        System.out.println("Miesieczna rata pozyczki na kwote " + cenaTowaru + " PLN i liczbie rat " + liczbaRat +
                " wynosi " + miesiecznaRata);
    }
}
