package fundamenty;//Zadanie 25

public class DzialaniaNaTablicach {
    public static void main(String[] args) {
        int[] tablicaLiczb = {13, -97, 11, 47, -52, 71, 4, 98, -9, -21};
        double suma = 0;
        double srednia = 0;
        int najwieksza = tablicaLiczb[0];
        int najmniejsza = tablicaLiczb[0];

        for (int liczba : tablicaLiczb) {
            suma = suma + liczba;
            srednia = suma / tablicaLiczb.length;
        }

        System.out.println("\nSrednia liczb z tablicy wynosi: " + srednia);

        for (int liczba : tablicaLiczb) {
            if (liczba > najwieksza) {
                najwieksza = liczba;
            }
        }

        System.out.println("\nNajwieksza liczba z tablicy wynosi: " + najwieksza);

        for (int liczba : tablicaLiczb) {
            if (liczba < najmniejsza) {
                najmniejsza = liczba;
            }
        }

        System.out.println("\nNajmniejsza liczba z tablicy wynosi: " + najmniejsza);
    }
}
