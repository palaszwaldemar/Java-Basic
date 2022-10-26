package proceduralne;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MetodyUzupelnienie {
    public static void main(String[] args) {
        System.out.println(zwrocSume(2, 5));
        System.out.println(zwrocSume(2, 5, -7));
        System.out.println(zwrocSume(1.3, 4.4, 6.2));
        int liczba = 10;
        System.out.println(zwrocSume(new int[]{1, 3, 8, 5}));
        System.out.println(liczba);
        System.out.println(zwrocSume(1, 3, 8));
        // rekurencja();
        // long i = 0;
        //ArrayList<Random> abc = new ArrayList<>();

        System.out.println(podajLiczbe());


    }

    static int zwrocSume(int a, int b) {
        return a + b;
    }

    static int zwrocSume(int a, int b, int c) {
        System.out.println("a");
        return a + b + c;
    }

    static double zwrocSume(double a, double b, double c) {
        return a + b + c;
    }

    static int zwrocSume(int... liczby) { //varargs
        System.out.println("b");
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        return suma;
    }

    static void rekurencja() {
        System.out.println("Hello");
        Random random = new Random();
        int losowa = random.nextInt(1000);
        if (losowa != 500) {
            rekurencja();
        }
        System.out.println(losowa);
    }

    static int podajLiczbe() {
        System.out.print("Podaj liczbe od 1 do 10: ");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();
        if (podanaLiczba < 1 || podanaLiczba > 10) {
            podanaLiczba = podajLiczbe();
        }
        return podanaLiczba;
    }
}
