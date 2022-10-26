package fundamenty;//Zadanie 23

public class OperacjeNaLiczbachFor {
    public static void main(String[] args) {
        String[] tablicaImion = {"Edward", "Janusz", "Dawid", "Tomasz", "Janina"};
        int liczba = 1;
        System.out.println("\nLiczby od 0 do 5000:");

        for (int i = 0; i <= 5000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nTablica imion:");
        for (String imiona : tablicaImion) {
            System.out.print(imiona + " ");
        }
        System.out.println();

        System.out.println("\nPierwsze 20 poteg liczby 2:");
        for (int i = 1; i <= 20; i++) {
            System.out.print((liczba) + " ");
            liczba *= 2;
        }
    }
}
