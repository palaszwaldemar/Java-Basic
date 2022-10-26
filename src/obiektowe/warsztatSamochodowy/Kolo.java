package obiektowe.warsztatSamochodowy;

public class Kolo {
    private double cisnienie;
    private boolean przebite;


    public Kolo(double cisnienie) {
        this.cisnienie = cisnienie;
    }

 /*   public void setCzyPrzebite(boolean czyPrzebite) {
        this.czyPrzebite = czyPrzebite;
    }

    public void setCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
    }*/

    public boolean isPrzebite() {
        return przebite;
    }

    @Override
    public String toString() {
        return "Kolo{" +
                "cisnienie=" + cisnienie +
                ", czyPrzebite=" + przebite +
                '}';
    }

    public void przebij() {
        cisnienie = 0;
        przebite = true;
    }

    public void naprawKolo() {
        cisnienie = 2.4;
        przebite = false;
    }
}
