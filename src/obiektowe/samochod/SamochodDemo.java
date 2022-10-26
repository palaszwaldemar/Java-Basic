package obiektowe.samochod;//zadanie 40, 42, 43, 44

import java.util.Scanner;

public class SamochodDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Samochod samochod1 = new Samochod();
        Samochod samochod2 = new Samochod("BMW", 199_000);

        samochod1.marka = "Toyota";
        samochod1.przebieg = 235_000;

        //zadanie 40
        /*samochod2.marka = "BMW";
        samochod2.przebieg = 199_000;*/

        samochod1.wyswietlMarkeOrazPrzebieg();
        samochod2.wyswietlMarkeOrazPrzebieg();

        System.out.println("Przebieg samochodu " + samochod1.marka + " po przejechanych kilometrach " + samochod1.zwiekszPrzebieg(155));
        System.out.println("Przebieg samochodu " + samochod2.marka + " po przejechanych kilometrach " + samochod2.zwiekszPrzebieg(301));

        System.out.println("W samochodzie " + samochod1.marka + " przeglad należy zrobić przy " + samochod1.zwrocKiedyPrzeglad());
        System.out.println("W samochodzie " + samochod2.marka + " przeglad należy zrobić przy " + samochod2.zwrocKiedyPrzeglad());

        Samochod[] samochody = new Samochod[] {samochod1, samochod2};
        for (Samochod samochod : samochody) {
            System.out.println("Marka: " + samochod.marka + ", przebieg: " + samochod.przebieg);
        }

        System.out.println(samochod1);
        System.out.println(samochod2);

        //zadanie 44
        System.out.print("\nPodaj marke samochodu: ");
        String marka = scanner.next();
        System.out.print("\nPodaj przebieg: ");
        int przebieg = scanner.nextInt();

        Samochod samochod3 = new Samochod(marka, przebieg);
        if (przebieg <= 200_000) {
            System.out.println("Dla samochodu o marce " + samochod3.marka + " zostalo jeszcze " + (200_000 - samochod3.przebieg) + " kilometrow do" +
                    " przegladu");
        } else {
            System.out.println("Samochod o marce " + samochod3.marka + " powinien zrobic przeglad juz " + (samochod3.przebieg - 200_000) + " kilometrow" +
                    " temu");
        }
    }
}

