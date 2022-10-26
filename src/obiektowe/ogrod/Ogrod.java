package obiektowe.ogrod;

import java.util.Arrays;

public class Ogrod {
    private final Lawka lawka;
    private final Kwiat[] kwiaty;
    private final Drzewo[] drzewa;
    private final Pies pies;

    public Ogrod(Lawka lawka, Kwiat[] kwiaty, int liczbaDrzew, Pies pies) {
        this.lawka = lawka;
        this.kwiaty = kwiaty;
        Drzewo[] drzewa = new Drzewo[liczbaDrzew];
        for (int i = 0; i < drzewa.length; i++) {
            drzewa[i] = new Drzewo();
        }
        this.drzewa = drzewa;
        this.pies = pies;
    }

    public Ogrod(Lawka lawka, Kwiat[] kwiaty, int liczbaDrzew) {
        this(lawka, kwiaty, liczbaDrzew, null);
    }

    void pracujWOgrodzie() {
        wejdzDoOgrodu();
        podlejKwiaty();
        odpocznij();
        zbierajOwoce();
        wyjdzZOgrodu();
    }

    void wejdzDoOgrodu() {
        if (pies != null) {
            pies.bawSie();
        } else {
            System.out.println("Wita cie szum wiatru");
        }
    }

    void podlejKwiaty() {
        for (Kwiat kwiat : kwiaty) {
            kwiat.podlej();
        }
    }

    void odpocznij() {
        System.out.println("Siadasz na lawce (z materialu: " + lawka.getMaterialWytworzenia() + ")");
    }

    void zbierajOwoce() {
        int iloscZebranychOwocow = 0;
        for (Drzewo drzewo : drzewa) {
            iloscZebranychOwocow += drzewo.zbierajOwoce();
        }
        if (iloscZebranychOwocow == 0) {
            System.out.println("Przyjdz jutro");
        } else {
            System.out.println("Zebrano " + iloscZebranychOwocow + " owocow");
        }
    }

    void wyjdzZOgrodu() {
        for (Drzewo drzewo : drzewa) {
            drzewo.owocuj();
        }
        for (Kwiat kwiat : kwiaty) {
            kwiat.setKwitnie(false);
        }
    }

    @Override
    public String toString() {
        return "Ogrod{" +
                "lawka=" + lawka +
                ", kwiaty=" + Arrays.toString(kwiaty) +
                ", drzewa=" + Arrays.toString(drzewa) +
                ", pies=" + pies +
                '}';
    }
}
