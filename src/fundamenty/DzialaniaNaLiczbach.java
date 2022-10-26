package fundamenty;//Zadanie 11

import java.util.Scanner;

public class DzialaniaNaLiczbach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPodaj liczbe: ");
        int liczba = scanner.nextInt();


        //czy jest parzysta
        //czy jest dodatnia
        if (liczba > 0) {
            System.out.println("Dodatnia");
        }//inne galezie


        if (liczba % 2 == 0) {
            System.out.println("Parzysta");
        }


        if (liczba > 0) {
            if (liczba % 2 == 0) {
                System.out.println("Liczba dodatnia, parzysta");
            } else {
                System.out.println("Liczba dodatnia, nieparzysta");
            }
        } else if (liczba == 0) {
            System.out.println("Liczba 0");
        } else if (liczba % 2 == 0) {
            System.out.println("Liczba ujemna, parzysa");
        } else {
            System.out.println("Liczba ujemna, nieparzysta");
        }
    }
}
