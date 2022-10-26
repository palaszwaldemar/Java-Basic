package obiektowe.dziedziczenie;

public abstract class Zwierze {
    private String imie;
    private int wiek;

  /*  public Zwierze() {
        super();
        System.out.println("Tworze Zwierze");
    }*/

    public Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    void jedz() {
        System.out.println("Zwierze zabiera sie do jedzenia");
    }

   abstract void dajGlos();
}
