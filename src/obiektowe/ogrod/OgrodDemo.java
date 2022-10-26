package obiektowe.ogrod;

public class OgrodDemo {
    public static void main(String[] args) {
        Lawka lawka = new Lawka("drewno");
        //Kwiat kwiat1 = new Kwiat();
        Kwiat kwiat2 = new Kwiat("zielony");
        Kwiat kwiat3 = new Kwiat();
        Kwiat[] kwiaty = {new Kwiat(), kwiat2, kwiat3};
        String sztuczka1 = "aport";
        String[] sztuczki = {sztuczka1, "lapa", "lezec"};
        Pies pies = new Pies();
        Ogrod ogrod = new Ogrod(lawka, kwiaty, 10, pies);

        ogrod.pracujWOgrodzie();
    }
}
