package obiektowe.poczta;

import java.util.Scanner;

public class Poczta {
    private double utarg = 0;
    private final Paczka[] paczkiNadane = new Paczka[100];
    private final List[] listyNadane = new List[10];
    private Paczka ostatniaPaczka;
    private int wolneMiejsce = 0;

    double nadajPaczke(Paczka paczka, double kwota) {
        if (paczka.zwrocCenePaczki() > kwota) {
            return kwota;
        }
        paczka.setStatus("nadana");
        utarg += paczka.zwrocCenePaczki();
        dodajPrzesylkeDoTablicyPaczekNadanych(paczka);
        //paczkiNadane[wolneMiejsce++] = paczka;
        ostatniaPaczka = paczka;
        return kwota - paczka.zwrocCenePaczki();
    }

    double nadajList(List list, double kwota) {
        if (list.zwrocCeneListu() <= kwota) {
            list.setStatus("nadany");
            utarg += list.zwrocCeneListu();
            dodajListDoTablicyListowNadanych(list);
            return kwota - list.zwrocCeneListu();
        } else {
            return kwota;
        }
    }

    Paczka utworzPaczke() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nadawce: ");
        String nadawca = scanner.next();
        System.out.print("Podaj odbiorce: ");
        String odbiorca = scanner.next();
        System.out.print("Podaj wage paczki: ");
        int waga = scanner.nextInt();
        return new Paczka(nadawca, odbiorca, waga);
    }

    List utworzList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ulice nadawcy: ");
        String ulicaNadawcy = scanner.next();
        System.out.print("Podaj numer domu nadawcy: ");
        int numerDomuNadawcy = scanner.nextInt();
        System.out.print("Podaj kod pocztowy nadawcy: ");
        String kodPocztowyNadawcy = scanner.next();
        Adres adresNadawcy = new Adres(ulicaNadawcy, numerDomuNadawcy, kodPocztowyNadawcy);

        System.out.print("Podaj ulice dbiorcy: ");
        String ulicaOdbiorcy = scanner.next();
        System.out.print("Podaj numer domu odbiorcy: ");
        int numerDomuOdbiorcy = scanner.nextInt();
        System.out.print("Podaj kod pocztowy odbiorcy: ");
        String kodPocztowyOdbiorcy = scanner.next();
        Adres adresOdbiorcy = new Adres(ulicaOdbiorcy, numerDomuOdbiorcy, kodPocztowyOdbiorcy);
        return new List(adresNadawcy, adresOdbiorcy);
    }

    public double getUtarg() {
        return utarg;
    }

    void dodajPrzesylkeDoTablicyPaczekNadanych(Paczka paczka) {
        for (int i = 0; i < paczkiNadane.length; i++) {
            if (paczkiNadane[i] == null) {
                paczkiNadane[i] = paczka;
                return;
            }
        }
    }

    void wyswietlOstatnioNadanaPaczke() {
        //System.out.println(paczkiNadane[wolneMiejsce-1]);
        for (int i = paczkiNadane.length - 1; i >= 0; i--) {
            if (paczkiNadane[i] != null) {
                System.out.println(paczkiNadane[i]);
                return;
            }
        }
    }

    void dodajListDoTablicyListowNadanych(List list) {
        for (int i = 0; i < listyNadane.length; i++) {
            if (listyNadane[listyNadane.length - 1] != null) {
                System.out.println("przepraszamy, poczta jest w stanie wysyłać tylko 10 listów dziennie, i co nam zrobisz?");
            } else if (listyNadane[i] == null) {
                listyNadane[i] = list;
                return;
            }
        }
    }

    void wyslijListonosza() {
        for (List list : listyNadane) {
            if(list==null){
                break;
            }
            //if (list != null) {
                list.setStatus("wyslany");
            //}
        }
    }
}
