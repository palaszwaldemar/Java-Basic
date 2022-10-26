package obiektowe.wstep;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int liczba = 2;
        String tekst = new String("Auto");
        int[] liczby = new int[] {1, 2, 3,};
        Random random = new Random();
        Osoba osoba = new Osoba("Adrian", 55);
        Osoba osoba2 = new Osoba("Jacek", 13);
        /*System.out.println(osoba);
        System.out.println(osoba2);
        Proceduralna.liczba = 10;
        System.out.println(Proceduralna.liczba);
        osoba.imie = "Tomasz";
        osoba.wiek = 25;
        osoba2.imie = "Anna";
        osoba2.wiek = 33;
        System.out.println(osoba.imie);
        System.out.println(osoba.wiek);
        System.out.println(osoba2.imie);
        System.out.println(osoba2.wiek);*/
        osoba.przedstawSie();
        osoba2.przedstawSie();
        osoba.wyprawUrodziny();
        System.out.println(osoba.wiek);
    }
}
