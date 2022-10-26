package obiektowe.dom;

import java.util.Arrays;

public class Pokoj {
    private final Lozko lozko;
    private final Okno[] okna;

    public Pokoj(Lozko lozko, Okno[] okna) {
        this.lozko = lozko;
        this.okna = okna;
    }

    public Pokoj() {
        okna = new Okno[]{new Okno(), new Okno()};
        lozko = new Lozko(5);
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "lozko=" + lozko +
                ", okna=" + Arrays.toString(okna) +
                '}';
    }

    void posprzataj() {
        //this.lozko.setLicznikWymianyPoscieli(0);
        lozko.posciel();
        for (Okno okno : okna) {
            okno.setOtwarte(true);
        }
    }
}
