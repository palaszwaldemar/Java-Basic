package obiektowe.poczta;

public class List {
    private final Adres adresNadawcy;
    private final Adres adresOdbiorcy;
    private boolean priorytet;
    private String status = "utworzony";

    public List(Adres adresNadawcy, Adres adresOdbiorcy) {
        this.adresNadawcy = adresNadawcy;
        this.adresOdbiorcy = adresOdbiorcy;
    }

     double zwrocCeneListu() {
        if (priorytet) {
            return 8.50;
        } else {
            return 6;
        }
     }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriorytet(boolean priorytet) {
        this.priorytet = priorytet;
    }

    @Override
    public String toString() {
        return "List{" +
                "adresNadawcy=" + adresNadawcy +
                ", adresOdbiorcy=" + adresOdbiorcy +
                ", priorytet=" + priorytet +
                ", status='" + status + '\'' +
                '}';
    }
}
