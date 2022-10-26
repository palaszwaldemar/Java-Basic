package obiektowe.enumy;

public enum Kierunek {
    LEWO(90, 70),
    PRAWO(90, 70),
    OSTRO_W_LEWO(120, 20),
    OSTRO_W_PRAWO(120, 20);

    private final int iloscStopni;
    private final int korektaPredkosci;

    Kierunek(int iloscStopni, int korektaPredkosci) {
        this.iloscStopni = iloscStopni;
        this.korektaPredkosci = korektaPredkosci;
    }

    public int getIloscStopni() {
        return iloscStopni;
    }

    public int getKorektaPredkosci() {
        return korektaPredkosci;
    }
}
