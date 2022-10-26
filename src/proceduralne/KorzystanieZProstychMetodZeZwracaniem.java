package proceduralne;//Zadanie 30

public class KorzystanieZProstychMetodZeZwracaniem {
    public static void main(String[] args) {
        int ulubionaLiczba = Metody.zwrocUlubionaLiczbe();
        System.out.println(ulubionaLiczba);
        System.out.println(Metody.zwrocSumeLiczb(2, -1, 5));
        System.out.println(Metody.zwrocLosowaLiczbe());
        System.out.println(Metody.zwrocIloscDni(1));
        System.out.println(Metody.podziel(10, 2));
        System.out.println(Metody.podziel(5, 0));
        System.out.println(Metody.zwrocDate(2, 12, 1990));
        if (Metody.sprawdzCzyIdentyczne(2, 2, 3)) {
            System.out.println("Takie same");
        } else {
            System.out.println("Inne");
        }
        System.out.println(Metody.zwrocSumeLiczbTablicy(new int[] {-1, 0, 12}));
        System.out.println(Metody.sprawdzCzyWystepujeWiekszaLiczba(new int[] {15, -5, 4, 8, 6}, 5));
        System.out.println(Metody.sprawdzCzyWystepujeWiekszaLiczba(new int[] {15, -5, 4, 8, 26}, 27));
        int[] tablica = Metody.zwrocTablice(100);
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
    }
}
