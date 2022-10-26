package obiektowe.samochod;

public class Samochod {
    String marka;
    int przebieg;
    int przebiegDoPrzegladu = 20_000;

    public Samochod() {
    }

    public Samochod(String marka, int przebieg) {
        this.marka = marka;
        this.przebieg = przebieg;
    }

    void wyswietlMarkeOrazPrzebieg() {
        System.out.println("Marka: " + marka + ", przebieg: " + przebieg);
    }

    int zwiekszPrzebieg(int odlegloscDoPrzejechania) {
        return przebieg + odlegloscDoPrzejechania;
    }

    int zwrocKiedyPrzeglad(){
        return przebieg + przebiegDoPrzegladu;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", przebieg=" + przebieg +
                ", przebiegDoPrzegladu=" + przebiegDoPrzegladu +
                '}';
    }
}
