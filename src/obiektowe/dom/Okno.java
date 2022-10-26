package obiektowe.dom;

public class Okno {
    private boolean otwarte;

    public void setOtwarte(boolean otwarte) {
        this.otwarte = otwarte;
    }

    public boolean isOtwarte() {
        return otwarte;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "otwwarte=" + otwarte +
                '}';
    }
}
