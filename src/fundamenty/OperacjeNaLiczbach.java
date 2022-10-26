package fundamenty;//Zadanie 16

public class OperacjeNaLiczbach {
    public static void main(String[] args) {
        int liczba1 = 1;
        int liczba2 = 99;
        int liczba3 = 20;
        int liczba4 = 1;

        System.out.println();
        while (liczba1 <= 10) {
            System.out.print(liczba1 + " ");
            liczba1++;
        }

        System.out.println();
        while (liczba2 >= 66) {
            System.out.print(liczba2 + " ");
            liczba2--;
        }

        System.out.println();
        while (liczba3 <= 40) {
            System.out.print(liczba3 + " ");
            liczba3 += 2;
        }

        System.out.println();
        while (liczba4 <= 5) {
            System.out.print("Waldemar ");
            liczba4++;
        }
    }
}
