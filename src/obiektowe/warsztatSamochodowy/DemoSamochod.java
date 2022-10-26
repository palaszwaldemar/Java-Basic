package obiektowe.warsztatSamochodowy;

public class DemoSamochod {
    public static void main(String[] args) {
        Kolo kolo1 = new Kolo(2.4);
        Kolo kolo2 = new Kolo(2.4);
        Kolo kolo3 = new Kolo(2.4);
        Kolo kolo4 = new Kolo(2.4);
        Kolo[] kola = {kolo1, kolo2, kolo3, kolo4};

        Samochod samochod = new Samochod(kola);
        System.out.println(samochod);
        samochod.zlapGume();
        System.out.println(samochod);

        Warsztat warsztat = new Warsztat();
        System.out.println(warsztat.naprawZepsuteKolo(samochod));
        System.out.println(samochod);
    }
}
