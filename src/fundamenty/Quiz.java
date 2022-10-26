package fundamenty;//Projekt 3: Quiz

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("\nWitaj w Quizie o tematyce muzycznej. Za każde pytanie możesz otrzymać 1 punkt.");
        System.out.println("Niektóre pytania mogą mieć więcej niż jedną odpowiedź. Powodzenia!!!\n");
        System.out.println("Pytanie 1:");
        System.out.print("W którym roku urodził sie Jan Sebastian Bach: ");
        Scanner scanner = new Scanner(System.in);
        int odpowiedzIntGracza = scanner.nextInt();
        int sumaPunktow = 0;
        if (odpowiedzIntGracza == 1685) {
            System.out.println("Gratuluje poprawnej odpowiedzi. Zdobywasz 1 punkt.");
            sumaPunktow++;
        } else {
            System.out.println("Niestety odpowiedz niepoprawna");
        }
        System.out.println("\nPytanie 2:");
        System.out.println("Z ilu dzwiekow sklada sie gama durowa?\n\ta) 4\n\tb) 6\n\tc) 7 \n\td) 8");
        System.out.print("Odpowiedz: ");
        String odpowiedzStringGracza = scanner.next();

        switch (odpowiedzStringGracza) {
            case "a", "b", "c" -> System.out.println("Niestety odpowiedz niepoprawna");
            case "d" -> {
                System.out.println("Gratuluje poprawnej odpowiedzi. Zdobywasz 1 punkt.");
                sumaPunktow++;
            }
        }
        System.out.println("\nPytanie 3:");
        System.out.println("""
                Jakie sa rodzaje harmonijek ustnych?
                \ta) Diatoniczna
                \tb) Septymowa
                \tc) Molowa
                \td) Akordowa
                \te) Chromatyczna""");
        System.out.print("Odpowiedz: ");
        odpowiedzStringGracza = scanner.next();
        if (odpowiedzStringGracza.contains("a") && odpowiedzStringGracza.contains("d") && odpowiedzStringGracza.contains("e")) {
            System.out.println("Gratuluje poprawnej odpowiedzi. Zdobywasz 1 punkt.");
            sumaPunktow++;
        } else {
            System.out.println("Niestety odpowiedz niepoprawna");
        }
        System.out.print("\nKoniec Quizu. Suma twoich punktow: " + sumaPunktow);
    }
}
