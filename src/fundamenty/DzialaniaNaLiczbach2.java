package fundamenty;//Zadanie 11 wariant trudniejszy

import java.util.Scanner;

public class DzialaniaNaLiczbach2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPodaj 1 liczbe: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj 2 liczbe: ");
        int liczba2 = scanner.nextInt();
        System.out.print("Podaj 3 liczbe: ");
        int liczba3 = scanner.nextInt();

        int najwieksza;
        if (liczba1 > liczba2 && liczba1 > liczba3) {
            najwieksza = liczba1;
        } else if (liczba2 > liczba3) {
            najwieksza = liczba2;
        }else{
            najwieksza = liczba3;
        }
        System.out.println("Najwiejsza: " + najwieksza);



        if (liczba1 > liczba2) {
            if (liczba1 > liczba3) {
                System.out.println("Najwieksza z podanych to: " + liczba1);
            } else {
                System.out.println("Najwieksza z podanych to: " + liczba3);
            }
        } else if (liczba2 > liczba3) {
            System.out.println("Najwieksza z podanych to: " + liczba2);
        } else {
            System.out.println("Najwieksza z podanych to: " + liczba3);
        }
        System.out.println();
    }
}
