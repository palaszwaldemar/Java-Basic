package obiektowe.poczta;

public class Adres {
    private final String ulica;
    private final int numerDomu;
    private final String kodPocztowy;

    public Adres(String ulica, int numerDomu, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numerDomu=" + numerDomu +
                ", kodPocztowy='" + kodPocztowy + '\'' +
                '}';
    }
}
