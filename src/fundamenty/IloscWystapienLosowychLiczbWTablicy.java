package fundamenty;//Zadanie 24

import java.util.Random;

public class IloscWystapienLosowychLiczbWTablicy {
    public static void main(String[] args) {
        int[] tab = new int[1000000];
        int[] tablicaPomocnicza = new int[100];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100)+1; //1-100
           // tablicaPomocnicza[tab[i]] = tablicaPomocnicza[tab[i]] + 1;
            tablicaPomocnicza[tab[i]-1]++;
        }

        for (int i = 0; i < tablicaPomocnicza.length; i++) {
            System.out.println("Liczba " + (i + 1) + " wystapila: " + tablicaPomocnicza[i] + " razy");
        }
    }
}
