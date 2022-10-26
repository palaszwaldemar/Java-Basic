package obiektowe.poczta;

import java.util.Random;

public class Paczka {
    //enkapsulacja/hermetyzacja - ukrywanie cech obiektow w obiekcie
    private String nadawca;
    private String odbiorca;
    private int waga;
    private boolean priorytet;
    private String status = "utworzona";

    public Paczka(String nadawca, String odbiorca, int waga) {
        if (nadawca == null || nadawca.isBlank()) {
            System.out.println("Brak nadawcy");
        } else {
            this.nadawca = nadawca;
        }
        if (odbiorca == null || odbiorca.isBlank()) {
            System.out.println("Brak odbiorcy");
        } else {
            this.odbiorca = odbiorca;
        }
        if (waga < 1 || waga > 100_000) {
            System.out.println("Błędna waga");
        } else {
            this.waga = waga;
        }
    }

    public Paczka() {
        String[] imiona = {"Justyna", "Tomasz", "Damian", "Anna", "Grzegorz"};
        Random random = new Random();
        odbiorca = imiona[random.nextInt(imiona.length)];
        nadawca = imiona[random.nextInt(imiona.length)];
        waga = random.nextInt(100_000) + 1;
        priorytet = random.nextBoolean();
    }

    double zwrocCenePaczki() {
        double cenaPaczki;
        if (waga <= 500) {
            cenaPaczki = 5;
        } else if (this.waga <= 1000) {
            cenaPaczki = 8;
        } else if (waga <= 2000) {
            cenaPaczki = 12;
        } else {
            cenaPaczki = 12 + ((waga - 2000) / 1000);
        }
        if (priorytet) {
            cenaPaczki += 0.1 * cenaPaczki;
        }
        return cenaPaczki;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "nadawca='" + nadawca + '\'' +
                ", odbiorca='" + odbiorca + '\'' +
                ", waga=" + waga +
                ", priorytet=" + priorytet +
                ", status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
