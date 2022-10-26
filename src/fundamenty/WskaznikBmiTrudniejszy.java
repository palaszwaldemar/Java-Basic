package fundamenty;//Zadanie 17 wariant trudniejszy

import java.util.Scanner;

public class WskaznikBmiTrudniejszy {
    public static void main(String[] args) {
        int waga;
        double wzrost;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nPodaj wage: ");
            waga = scanner.nextInt();
            System.out.print("\nPodaj wzrost: ");
            wzrost = scanner.nextDouble();
        } while (waga >= 200 || wzrost >= 3);
        double wskaznikBmi = waga / (wzrost * wzrost);
        System.out.print("Wskaznik BMI wynosi: " + wskaznikBmi + ". ");

        if (wskaznikBmi > 24.9) {
            System.out.print("\nNadwaga");
        } else if (wskaznikBmi < 18.5) {
            System.out.print("\nNiedowaga");
        } else {
            System.out.print("\nWaga prawidlowa");
        }
    }
}
