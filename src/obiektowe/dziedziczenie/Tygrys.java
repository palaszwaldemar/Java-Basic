package obiektowe.dziedziczenie;

public class Tygrys extends Zwierze {
    private final String kolor;

    public Tygrys(String imie, int wiek,String kolor) {
        super(imie, wiek);
        this.kolor = kolor;
    }

 /*   public Tygrys(String imie, int wiek, String kolor) {
        //super();
        this.imie = imie;
        this.wiek = wiek;
        this.kolor = kolor;
    }*/

    public Tygrys() {
        super("Bogdan",56);
        kolor = "pomaranczowy";
    }

    void ryczenie() {
        System.out.println("Tygrys ryczy");
    }

    void skok() {
        System.out.println("Tygrys skacze");
    }
    @Override
    void jedz() {
        super.jedz();
        System.out.println("Tygrys je sarne");
    }

    @Override
    void dajGlos() {
        ryczenie();
    }
}
