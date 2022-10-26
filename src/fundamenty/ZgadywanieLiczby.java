package fundamenty;//Zadanie 18

import java.util.Random;
import java.util.Scanner;

public class ZgadywanieLiczby {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int losowanaLiczba = random.nextInt(10) + 1;
        System.out.println(losowanaLiczba);
        int iloscProb = 0;
        int liczbaUzytkownika;

        do {
            System.out.print("\nPodaj liczbe: ");
            liczbaUzytkownika = scanner.nextInt();
            if (liczbaUzytkownika > losowanaLiczba) {
                System.out.println("Za wysoko");
            }else{
                System.out.println("Za nisko");
            }

            if (liczbaUzytkownika < losowanaLiczba - 1 || liczbaUzytkownika>losowanaLiczba+1) {
                System.out.println("Zimno");
            }else{
                System.out.println("Gorąco");
            }

           /* if (liczbaUzytkownika < losowanaLiczba - 1) {
                System.out.println("Za nisko. Zimno...");
            } else if (liczbaUzytkownika > losowanaLiczba + 1) {
                System.out.println("Za wysoko. Zimno...");
            } else if (liczbaUzytkownika == losowanaLiczba - 1) {
                System.out.println("Za nisko. Goraco!");
            } else if (liczbaUzytkownika == losowanaLiczba + 1) {
                System.out.println("Za wysoko. Goraco!");
            }*/
            iloscProb++;
        } while (losowanaLiczba != liczbaUzytkownika);
        System.out.println("Gratuluje. Liczba trafiona. Udalo sie za " + iloscProb + " razem");
    }
}
