package obiektowe.poczta;

public class PocztaDemo {
    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(++i);



        Paczka paczka1 = new Paczka("Tomasz", "Edward", 4500);
        Paczka paczka2 = new Paczka();
        Paczka paczka3 = null;
        paczka3 = paczka1;

        System.out.println(paczka1.zwrocCenePaczki());
        System.out.println(paczka2.zwrocCenePaczki());
        System.out.println(paczka3.zwrocCenePaczki());
        System.out.println("\n--------------------\n");

        Paczka[] paczki1 = {
                new Paczka("Waldemar", "Damian", 2000),
                new Paczka("Justyna", "Mateusz", 6500),
                new Paczka("Kamil", "Wiktor", 500)
        };
        System.out.println(paczki1[0]);
        System.out.println();
        Paczka[] paczki2 = new Paczka[100];



        for (int i = 0; i < paczki2.length; i++) {
            paczki2[i] = new Paczka();
        }

        for (Paczka paczka : paczki2) {
            System.out.println(paczka);
        }

        System.out.println("------------------------");
        double lacznaCenaWyslaniaPaczek = 0;
        for (Paczka paczka : paczki2) {
            lacznaCenaWyslaniaPaczek += paczka.zwrocCenePaczki();
        }
        System.out.println("Laczna cena wyslania paczek to: " + lacznaCenaWyslaniaPaczek);
        System.out.println("\n----------------\n");
        Poczta poczta = new Poczta();
        Paczka paczka4 = poczta.utworzPaczke();
        System.out.println(paczka4);
        System.out.println("Cena paczki: " + paczka4.zwrocCenePaczki());
        System.out.println("Reszta dla klienta: " + poczta.nadajPaczke(paczka4, 50));
        System.out.println(paczka4);
        System.out.println("Suma utargu z nadanych paczek i listow " + poczta.getUtarg());
        Paczka paczka5 = poczta.utworzPaczke();
        System.out.println(paczka5);
        System.out.println("Cena paczki: " + paczka5.zwrocCenePaczki());
        System.out.println("Reszta dla klienta: " + poczta.nadajPaczke(paczka5, 30));
        System.out.println(paczka5);
        System.out.println("Suma utargu z nadanych paczek i listow " + poczta.getUtarg());

        System.out.println("\n---------------------\n");
        System.out.println("Ostatnia nadana paczka");
        poczta.wyswietlOstatnioNadanaPaczke();
        System.out.println("\n--------------------------\n");
        Adres adres1 = new Adres("Slomiana", 4, "30-316");
        System.out.println(adres1);
        System.out.println("\n----------------------------\n");

        List list1 = poczta.utworzList();
        System.out.println(list1);
        System.out.println("Cena listu: " + list1.zwrocCeneListu());
        System.out.println("Reszta dla klienta: " + poczta.nadajList(list1, 10));
        System.out.println(list1);
        System.out.println("Suma utargu z nadanych paczek i listow " + poczta.getUtarg());
        List list2 = poczta.utworzList();
        list2.setPriorytet(true);
        System.out.println(list2);
        System.out.println("Cena listu: " + list2.zwrocCeneListu());
        System.out.println("Reszta dla klienta: " + poczta.nadajList(list2, 50));
        System.out.println(list2);
        System.out.println("Suma utargu z nadanych paczek i listow " + poczta.getUtarg());

        System.out.println("\n--------------------\n");
        poczta.wyslijListonosza();
        System.out.println(list1);
        System.out.println(list2);
    }
}
