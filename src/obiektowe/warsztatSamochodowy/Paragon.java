package obiektowe.warsztatSamochodowy;

public class Paragon {
    private final String rodzajUslugi;
    private final int iloscWykonanychNapraw;
    private final double cenaNaprawy;

    public Paragon(String rodzajUslugi, int iloscWykonanychNapraw, double cenaNaprawyJednegoKola) {
        this.rodzajUslugi = rodzajUslugi;
        this.iloscWykonanychNapraw = iloscWykonanychNapraw;
        this.cenaNaprawy = cenaNaprawyJednegoKola * iloscWykonanychNapraw;
    }

    @Override
    public String toString() {
        return "Paragon{" +
                "rodzajUslugi='" + rodzajUslugi + '\'' +
                ", iloscWykonanychNapraw=" + iloscWykonanychNapraw +
                ", cenaNaprawy=" + cenaNaprawy +
                '}';
    }
}
