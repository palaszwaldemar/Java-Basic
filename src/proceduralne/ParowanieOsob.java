package proceduralne;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ParowanieOsob {

    public static void main(String[] args) {
        System.out.println("Program do losowania par na Mikolaki\n");
        System.out.print("Podaj ilosc osob na mikolajki: ");
        int iloscOsob = podajIloscOsob();
        String[] osoby = stworzTabliceOsob(iloscOsob);
        System.out.println("Osoby biorące udział w zabawie:");
        System.out.println(Arrays.toString(osoby));
        String[] osobyWylosowane = stworzTabliceWylosowanych(osoby);
      //  System.out.println(Arrays.toString(osobyWylosowane));
        System.out.println("\nWylosowane pary:");
        wyswietlWylosowanePary(osoby, osobyWylosowane);
    }

    static int podajIloscOsob() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String[] stworzTabliceOsob(int iloscOsob) {
        Scanner scanner = new Scanner(System.in);
        String[] tablicaOsob = new String[iloscOsob];
        for (int i = 1; i <= iloscOsob; i++) {
            System.out.print("Podaj " + i + " osobe: ");
            tablicaOsob[i - 1] = scanner.next();
        }
        return tablicaOsob;
    }

    static String[] stworzTabliceWylosowanych(String[] osoby) {
        String[] osobyOdberajacePrezent = Arrays.copyOf(osoby, osoby.length);
        String[] osobyWylosowane = new String[osoby.length];
        Random random = new Random();

        for(int i = 0; i < osobyWylosowane.length; i++) {
            int osobaWylosowana = random.nextInt(osobyOdberajacePrezent.length);
            if (i == osobaWylosowana || osobyOdberajacePrezent[osobaWylosowana] == null) {
                i--;
                continue;
            }
            osobyWylosowane[i] = osobyOdberajacePrezent[osobaWylosowana];
            osobyOdberajacePrezent[osobaWylosowana] = null;
        }
        return osobyWylosowane;
    }

    static void wyswietlWylosowanePary(String[] osoby, String[] osobyWylosowane) {
        for(int i = 0; i < osoby.length; i++) {
            System.out.println(osoby[i] + " --> " + osobyWylosowane[i]);
        }
    }



}
