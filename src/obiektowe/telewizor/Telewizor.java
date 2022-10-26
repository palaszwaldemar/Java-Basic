package obiektowe.telewizor;

public class Telewizor {
    private final String producent;
    private final double cena;
    private final int wielkoscWCalach;
    private boolean wlaczonePolaczenieZTelefonem;

    public Telewizor(String producent, double cena, int wielkoscWCalach) {
        this.producent = producent;
        this.cena = cena;
        this.wielkoscWCalach = wielkoscWCalach;
    }

    String wyswietlNapisPowitalny(String napis) {
        return napis;
    }

    void wlaczPolaczenieZTelefonem() {
        this.wlaczonePolaczenieZTelefonem = true;
    }
    @Override
    public String toString() {
        return "Telewizor{" +
                "cena=" + cena +
                ", wielkoscWCalach=" + wielkoscWCalach +
                ", możliwośćPolaczeniaZAndroid=" + wlaczonePolaczenieZTelefonem +
                '}';
    }

    public String getProducent() {
        return producent;
    }

    public double getCena() {
        return cena;
    }
}
