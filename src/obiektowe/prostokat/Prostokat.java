package obiektowe.prostokat;

public class Prostokat {
    int wysokosc;
    int szerokosc;
    String wypelnienie;

    public Prostokat(int wysokosc, int szerokosc, String wypelnienie) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.wypelnienie = wypelnienie;
    }

    void drukujProstokat() {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(wypelnienie);
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                ", wypelnienie='" + wypelnienie + '\'' +
                '}';
    }
}
