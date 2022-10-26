package fundamenty;//Zadanie 14

import java.util.Random;

public class LosowanieLiczby {
    public static void main(String[] args) {
        System.out.println("\nZaczynamy losowanie!");

        Random random = new Random();
        int sumaLosowan = 0;

        int wylosowana = 0;

        while (wylosowana != 10) {
            wylosowana = random.nextInt(10) + 1;
            System.out.println(wylosowana);
            sumaLosowan++;
        }

        System.out.println("Trafione!\nWylosowano liczbe za " + sumaLosowan + " razem\n\n");
        System.out.println("Teraz losuje liczby " + sumaLosowan + " razy");

        while (sumaLosowan > 0) {
            wylosowana = random.nextInt(10) + 1;
            System.out.println(wylosowana);
            sumaLosowan--;
        }
    }
}
