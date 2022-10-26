package obiektowe.wstep;

public class Osoba {
    String imie;
    int wiek;

    Osoba (String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    void przedstawSie() {
        System.out.println("Nazywam sie " + imie + ". Mam " + wiek + " lat");
    }

    void wyprawUrodziny() {
        wiek = wiek + 1;
    }
}
