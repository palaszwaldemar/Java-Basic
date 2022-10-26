package obiektowe.dom;

public class Lozko {
    private int licznikWymianyPoscieli;

    public Lozko(int licznikWymianyPoscieli) {
        this.licznikWymianyPoscieli = licznikWymianyPoscieli;
    }

    @Override
    public String toString() {
        return "Lozko{" +
                "licznikWymianyPoscieli=" + licznikWymianyPoscieli +
                '}';
    }

    public void setLicznikWymianyPoscieli(int licznikWymianyPoscieli) {
        this.licznikWymianyPoscieli = licznikWymianyPoscieli;
    }

    public void posciel() {
        licznikWymianyPoscieli = 0;
    }
}
