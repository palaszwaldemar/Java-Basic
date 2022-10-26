package obiektowe.telewizor;

public class Paragon {
    private final String producent;
    private final double cena;

    public Paragon(Telewizor telewizor) {
        this.producent = telewizor.getProducent();
        this.cena = telewizor.getCena();
    }

    @Override
    public String toString() {
        return "Paragon{" +
                "producent='" + producent + '\'' +
                ", cena=" + cena +
                '}';
    }
}
