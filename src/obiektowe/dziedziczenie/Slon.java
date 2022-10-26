package obiektowe.dziedziczenie;

public class Slon extends Zwierze {
    private final int dlugoscTraby;

    public Slon(String imie, int wiek, int dlugoscTraby) {
        super(imie, wiek);
        this.dlugoscTraby = dlugoscTraby;
    }

    public Slon() {
        super("Stefan", 34);
        dlugoscTraby = 100;
    }

    void trabienie() {
        System.out.println("Slon trabi");
    }

    void bieganie() {
        System.out.println("Slon biegnie");
    }

     void jedz() {
        System.out.println("Slon je liscie");
    }

    @Override
    void dajGlos() {
        trabienie();
    }
}
