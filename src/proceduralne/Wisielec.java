package proceduralne;

import java.util.Random;
import java.util.Scanner;

public class Wisielec {
    private static final String[] HASLA = {
            "Jak Kuba Bogu tak Bog Kubie",
            "Kto sie smieje ten sie smieje  ostatni",
            "W marcu jak w garncu",
            "Raz kozie smierc"
    };
    private static int iloscZyc = 5;

    public static void main(String[] args) {
        System.out.println("GRA W WISIELCA  PRZYSLOWIA");
        System.out.println("Rozszyfruj podane haslo:\n");
        String wylosowaneHaslo = wylosujHaslo().toUpperCase();

        String zakodowaneHaslo = zakodujHaslo(wylosowaneHaslo);
        System.out.println(zakodowaneHaslo + "\n");
        do {
            System.out.println("Pozostala liczba prob: " + iloscZyc);
            String znak = podajZnak().toUpperCase();
            if(Wisielec.czyZnakJestWTekscie(znak, wylosowaneHaslo)) {
                if (czyZnakJestWTekscie(znak, zakodowaneHaslo)) {
                    System.out.println("Ten znak juz podawales");
                } else {
                    zakodowaneHaslo = dekodujHaslo(znak,wylosowaneHaslo,zakodowaneHaslo);
                    System.out.println("Gratuluje. Trafiles");
                }
            } else {
                System.out.println("Niestety nie trafione");
                iloscZyc--;
            }
            System.out.println(zakodowaneHaslo + "\n");
        } while (iloscZyc > 0 && !czyCaleHasloOdgadniete(zakodowaneHaslo));
        if (iloscZyc > 0) {
            System.out.println("Gratuluje. Wygrales!");
        } else {
            System.out.println("Niestety nie udalo ci sie odgadnac hasla do konca :(");
            System.out.println("Haslo brzmialo:");
            System.out.println(wylosowaneHaslo);
        }
    }
    static String wylosujHaslo() {
        Random random = new Random();
        int wylosowaneHasloIndeks = random.nextInt(HASLA.length);
        return HASLA[wylosowaneHasloIndeks];
    }

    static String zakodujHaslo2(String wylosowaneHaslo) {
        char[] Litery = wylosowaneHaslo.toCharArray();
        for(int i = 0; i < Litery.length; i++) {
            if (Litery[i] != ' ') {
                Litery[i] = '*';
            }
        }
        return new String(Litery);
    }

    static String zakodujHaslo(String wylosowaneHaslo) {
        StringBuilder zakodowaneHaslo = new StringBuilder();
        for (int i = 0; i < wylosowaneHaslo.length(); i++) {
            char litera = wylosowaneHaslo.charAt(i);
            if (litera != ' ') {
                zakodowaneHaslo.append("*");
            } else {
                zakodowaneHaslo.append(" ");
            }
        }
        return zakodowaneHaslo.toString();
    }

    static String podajZnak() {
        System.out.print("Podaj znak: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    static String dekodujHaslo(String znak, String wylosowaneHaslo, String zakodowaneHaslo) {
        char[] zakodowaneZnaki = zakodowaneHaslo.toCharArray();
        char[] wylosowaneZnaki = wylosowaneHaslo.toCharArray();
        char[] znakChar = znak.toCharArray();
        for(int i = 0; i < wylosowaneHaslo.length(); i++) {
            if(znakChar[0] == wylosowaneZnaki[i]) {
                zakodowaneZnaki[i] = znakChar[0];
            }
        }
        return new String(zakodowaneZnaki);
    }

    static boolean czyCaleHasloOdgadniete(String zakodowaneHaslo) {
        for (int i = 0; i < zakodowaneHaslo.length(); i++) {
            if (zakodowaneHaslo.charAt(i) == '*') {
                return false;
            }
        }
        return true;
    }

    //czy podany znak w hasle
    static boolean czyZnakJestWTekscie(String znak, String tekst) {
        for (int i = 0; i < tekst.length(); i++) {
            if (znak.charAt(0) == tekst.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    /*static boolean sprawdzCzyZnakBylJuzPodany(String znak, String zakodowaneHaslo) {
        char[] znakChar = znak.toCharArray();
        char[] zakodowaneZnaki = zakodowaneHaslo.toCharArray();
        for (int i = 0; i < zakodowaneHaslo.length(); i++) {
            if (znakChar[0] == zakodowaneZnaki[i]) {
                return true;
            }
        }
        return false;
    }*/
}
