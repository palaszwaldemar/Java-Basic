package fundamenty;//Projekt 2: fundamenty.Loteria

import proceduralne.Metody;

import java.util.Arrays;

public class Loteria {
    public static void main(String[] args) {


        System.out.println("Zaczynamy loterie \nProsze podac 6 liczb z zakresu od 1 do 24 \n");

        System.out.println("\n");
        int[] wprowadzone = Metody.wprowadz6Liczb();

        int[] wylosowane = Metody.wylosuj6Liczb();
        System.out.println();

        System.out.println("Liczby wybrane przez ciebie:");
        System.out.print(Arrays.toString(wprowadzone));
        System.out.println();

        System.out.println("Wylosowane liczby to:");
        System.out.print(Arrays.toString(wylosowane));


        System.out.println("\n");
        int iloscTrafien = Metody.policzTrafienia(wprowadzone, wylosowane);
        System.out.println("Ilosc trafionych liczb:" + " " + iloscTrafien);

        Metody.wyswietlIloscTrafien(iloscTrafien);


    }

}
