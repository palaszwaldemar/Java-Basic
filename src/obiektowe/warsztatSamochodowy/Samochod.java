package obiektowe.warsztatSamochodowy;

import java.util.Arrays;
import java.util.Random;

public class Samochod {
    private final Kolo[] kola;

    public Samochod(Kolo[] kola) {
        this.kola = kola;
    }

    void zlapGume() {
        Random random = new Random();
        for (Kolo kolo : kola) {
            if (random.nextBoolean()) {
                kolo.przebij();
            }
          /*  kolo.setCzyPrzebite(random.nextBoolean());
            if (kolo.isCzyPrzebite()) {
                kolo.setCisnienie(0.0);
            }*/
        }
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "kola=" + Arrays.toString(kola) +
                '}';
    }

    public Kolo[] getKola() {
        return kola;
    }
}
