package fundamenty;//Zadanie 10

import java.util.Random;
import java.util.Scanner;

public class Kostka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\nProgram rzuci dla Ciebie kostką do gry i wylosuje liczbę!");
        System.out.print("Proszę, podaj ile ścianek ma mieć kostka która rzucasz: ");
        int liczbaScian = scanner.nextInt();
        int wylosowana = random.nextInt(liczbaScian) + 1;
        System.out.println("Rzucam kostką o ilości ścianek: " + liczbaScian);
        System.out.println("Wyszło mi: " + wylosowana);
    }
}
