package obiektowe.dziedziczenie;

public class Malpa extends Zwierze {

    public Malpa(String imie, int wiek) {
        super(imie, wiek);
    }

    @Override
    void dajGlos() {
        System.out.println("Malpa daje glos");
    }

    void chodzPoDrzewach() {

    }
}


