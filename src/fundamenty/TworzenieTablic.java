package fundamenty;//Zadanie 20

import java.util.Arrays;
import java.util.Random;

public class TworzenieTablic {
    public static void main(String[] args) {
       // Random random = new Random();

        double[] liczby = {2.1, 4.4, 5.0, 13,9};
        System.out.println("\n" + Arrays.toString(liczby));
       // double liczba = liczby[0];
       // liczba = 10;

        boolean[] wartosci = {true, false};
        System.out.println("\n" + Arrays.toString(wartosci));

        char[] znaki = {'j', 'a', 'v', 'a'};
        System.out.println("\n" + Arrays.toString(znaki));

        //tablica obiektow typu random + wylosowanie liczby drugim z nich
        Random[] tablicaRandom = {new Random(), new Random(),new Random()};

        System.out.println("\n" + Arrays.toString(tablicaRandom));

        int liczba = tablicaRandom[1].nextInt(6);
        System.out.println("\n" + liczba);
    }
}
