package fundamenty;//Zadanie 21

public class OperacjeNaTablicyLiczb {
    public static void main(String[] args) {
        int[] tablica = {1, 15, 77, 43, 542, 765, 54, 999, 87, 325};

        System.out.println("\nLiczby w talbicy:");
        for (int liczby : tablica) {
            System.out.print(liczby + " ");
        }

        System.out.println("\n\nLiczby wieksze niz 100:");
        for (int liczby : tablica) {
            if (liczby > 100) {
                System.out.print(liczby + " ");
            }
        }

        System.out.println("\n\nLiczby nieparzyste i mniejsze od 750:");
        for (int liczby : tablica) {
            if (liczby < 750 && liczby % 2 != 0) {
                System.out.print(liczby + " ");
            }
        }
    }
}
