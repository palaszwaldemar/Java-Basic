//private - dostęp tylko z danej klasy
// domyślny - wtedy kiedy nic nienapiszemy. Dostęp w ramach pakietu
// protected - pakiet i klasy dziedziczące
// public - dostępna wszędzie

package proceduralne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metody {
    static void wyswietlNapis() {
        System.out.println("Hello");
    }

    static void wyswietlPowitanie(String imie) {
        System.out.println("Witaj " + imie);
    }

    static void wyswietlTekstPodanaIloscRazy(String tekst, int liczba) {
        for (int i = 0; i < liczba; i++) {
            System.out.print(tekst + " ");
        }
        System.out.println();
    }

    static void wyswietlPowitanie(String imie, int wiek) {
        if (wiek <= 20) {
            System.out.println("Czesc " + imie);
        } else {
            System.out.println("Dzien dobry " + imie);
        }
    }

    static void przywitajWszyskich(String[] imionaWTablicy) {
        for (String imiona : imionaWTablicy) {
            System.out.println("Witaj " + imiona);
        }
    }

    static void wyliczLacznaCeneTowaru(int iloscSztuk, double cena, int podatek) {
        double lacznaCenaBezPrzesylki = (iloscSztuk * cena) + (podatek * iloscSztuk * cena / 100);
        wyliczCzyPrzesylkaDarmowa(lacznaCenaBezPrzesylki);
    }

    static void wyliczCzyPrzesylkaDarmowa(double lacznaCena) {
        boolean darmowaWysylka;
        if (lacznaCena < 100) {
            darmowaWysylka = false;
        } else {
            darmowaWysylka = true;
        }

        if (darmowaWysylka) {
            System.out.println("Zamowione produkty przekraczaja wartosc 100 PLN. Przesylka bedzie darmowa. " +
                    "Koszt produktow wynosi " + lacznaCena);
        } else {
            System.out.println("Zamowione produkty nie przekraczaja warosci 100 PLN. Koszt przesylki wynosi 10 PLN. " +
                    "Koszt produktow z przesylka wynosi " + (lacznaCena + 10));
        }
    }

    static int zwrocUlubionaLiczbe() {
        return 7;
    }

    static int zwrocSumeLiczb(int a, int b, int c) {
        return a + b + c;
    }

    static int zwrocLosowaLiczbe() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    static int zwrocIloscDni(int lata) {
        return lata * 365;
    }

    static int podziel(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    static String zwrocDate(int dzien, int miesiac, int rok) {
        String number1ToString = "";
        String number2ToString = "";
        if (dzien < 10) {
            number1ToString = "0";
        }
        if (miesiac < 10) {
            number2ToString = "0";
        }
        return number1ToString + dzien+ "-" + number2ToString + miesiac+"-" + rok;
    }


    static boolean sprawdzCzyIdentyczne(int a, int b, int c) {
        return a == b && a == c;
    }

    static int zwrocSumeLiczbTablicy(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        return suma;
    }

    static boolean sprawdzCzyWystepujeWiekszaLiczba(int[] liczby, int liczbaPodana) {
        for (int liczba : liczby) {
            if (liczba > liczbaPodana) {
                return true;
            }
        }
        return false;
    }

    static int zwrocWIelkoscTablicy(int liczbaPodana) {
        int wielkoscTablicy = 0;
        petlaGlowna:
//petla ustalajaca wielkosc tablicy
        for (int i = 2; i < liczbaPodana; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue petlaGlowna;
                }
            }
            wielkoscTablicy++;
        }
        return wielkoscTablicy;
    }

    static int[] zwrocTablice(int liczba) {
        int[] tablicaDoZwrocenia = new int[10];
        int indeksTablicy = 0;
        // petlaGlowna ://petla wypelniajaca tablice liczbami pierwszymi
        for (int i = 2; i < liczba; i++) {
            if (!czyLiczbaPierwsza(i)) {
                continue;
            }
            tablicaDoZwrocenia = addOnTheEnd(indeksTablicy, i, tablicaDoZwrocenia);
            indeksTablicy++;
        }
        tablicaDoZwrocenia = Arrays.copyOf(tablicaDoZwrocenia, indeksTablicy);
        return tablicaDoZwrocenia;
    }

    static ArrayList<Integer> zwrocListe(int liczba) {
        ArrayList<Integer> lista = new ArrayList<>();
        // petlaGlowna ://petla wypelniajaca tablice liczbami pierwszymi
        for (int i = 2; i < liczba; i++) {
            if (!czyLiczbaPierwsza(i)) {
                continue;
            }
            lista.add(i);
        }
        return lista;
    }

    public static int[] addOnTheEnd(int index, int number, int[] array) {
        if (index < array.length) {
            array[index] = number;
            return array;
        }
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = number;
        return newArray;
    }

    static boolean czyLiczbaPierwsza(int liczba) {
        for (int i = 2; i <= liczba / 2; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zwrocTablice(50)));
        System.out.println(zwrocListe(50));
    }

    public static int[] wprowadz6Liczb() {
        int[] array = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Wprowadz " + (i + 1) + " liczbe: ");
            array[i] = scanner.nextInt();
            if (array[i] < 1 || array[i] > 24) {
                System.out.println("Podana liczba nie miesci sie w zakresie");
                i--;
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (array[i] == array[i - j]) {
                    System.out.println("Ta liczba zostala juz podana");
                    i--;
                    break;
                }
            }
        }
        return array;
    }

    public static int[] wylosuj6Liczb() {
        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {//petla losujaca 6 liczb z podanego zakresu
            array[i] = random.nextInt(24) + 1;

            for (int j = 1; j <= i; j++) {//petla sprawdzjaca czy wylosowana liczba sie nie powtarza
                if (array[i] == array[i - j]) {
                    i--;
                    break;
                }
            }
        }
        return array;
    }

    public static int policzTrafienia(int[] tablicaWybranych, int[] tablicaWylosowanych) {
        int sumaTrafien = 0;
        for (int wprowadzona : tablicaWybranych) {
            for (int wylosowana : tablicaWylosowanych) {
                if (wprowadzona == wylosowana) {
                    sumaTrafien++;
                }
            }
        }
        return sumaTrafien;
    }

    static double policzPotege(double liczba1, int liczba2) {
        double wynik = 1;
        for (int i = 1; i <= liczba2; i++) {
            wynik *= liczba1;
        }
        return wynik;
    }

    static long przeliczMinutyNaMilisekundy(int minuty) {
        return minuty * 60000;
    }

    public static void wyswietlIloscTrafien(int iloscTrafien) {
        switch (iloscTrafien) {
            case 0, 1, 2 -> System.out.println("Niestety nic nie wygrales. Graj dalej!");
            case 3 ->System.out.println("Gratuluje. Wygrales 16 PLN!");
            case 4 -> System.out.println("Gratuluje. Wygrales 200 PLN!");
            case 5 -> System.out.println("Gratuluje. Wygrales 4 000 PLN!");
            case 6 -> System.out.println("Gratuluje glownej wygranej w wysokosci 1 500 000 PLN!!!");
        }
    }

    static int ileRazyObrociByte(int liczba) {
        if (liczba  >= 128) {
            return iloscObrotowGdyLiczbaWiekszaOd127(liczba);
        }
        if (liczba <= -129) {
            return iloscObrotowGdyLiczbaMniejszaOdMinus128(liczba);
        }
        return 0;
    }
    static int iloscObrotowGdyLiczbaWiekszaOd127(int liczba) {
        int liczbaObrotow = 0;
        for(int i = 127; i < liczba; i += 256) {
            liczbaObrotow++;
        }
        return liczbaObrotow;
    }
    static int iloscObrotowGdyLiczbaMniejszaOdMinus128(int liczba) {
        int liczbaObrotow = 0;
        for(int i = -128; i > liczba; i -= 256) {
            liczbaObrotow++;
        }
        return liczbaObrotow;
    }



    static int zwrocLiczbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        String tekst = scanner.next();
        int liczba;

        for (int i = 0; i < tekst.length(); i++) {
            if (i ==0 && tekst.charAt(i) == '-'&& tekst.length()>1) {
                continue;
            }
            if (!(Character.isDigit(tekst.charAt(i)))) {
                liczba = zwrocLiczbe();
                return liczba;
            }
        }
        return Integer.parseInt(tekst);
    }

    static int zwrocPozcjeElementu(int liczba, int[] tablica) {
        System.out.println(Arrays.toString(tablica));
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));
        return Arrays.binarySearch(tablica, liczba);
    }
}
