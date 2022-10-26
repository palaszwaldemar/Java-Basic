package fundamenty;//Zadanie 12

import java.util.Scanner;

public class Pogoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nCzy pada desz? [true/false]: ");
        boolean deszcz = scanner.nextBoolean();
        System.out.print("Czy swieci slonce? [true/false]: ");
        boolean swieciSlonce = scanner.nextBoolean();

        if (deszcz && swieciSlonce) {
            System.out.println("Tecza!");
        } else if (!deszcz && swieciSlonce) {
            System.out.println("Jest pogodnie!");
        } else if (!deszcz) {
            System.out.println("Jest pochmurno...");
        } else {
            System.out.println("Ulewa!");
        }
    }
}
