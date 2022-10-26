package obiektowe.linia;

public class Linia {
    int dlugosc;
    String wypelnienie;

    public Linia(int dlugosc, String wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    void wydrukujLinie() {
        for (int i = 0; i < dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Linia{" +
                "dlugosc=" + dlugosc +
                ", wypelnienie='" + wypelnienie + '\'' +
                '}';
    }
}
