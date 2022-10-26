package obiektowe.warsztatSamochodowy;

public class Warsztat {

    Paragon naprawZepsuteKolo(Samochod samochod) {
        int iloscNprawionychKol = 0;
        for (Kolo kolo : samochod.getKola()) {
            if (kolo.isPrzebite()) {
                kolo.naprawKolo();
            }
        }
        return new Paragon("Naprawa kola", iloscNprawionychKol, 20.0);
    }
}
