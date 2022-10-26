package obiektowe.ogrod;

public class Lawka {
    private final String materialWytworzenia;

    public Lawka(String materialWytworzenia) {
        this.materialWytworzenia = materialWytworzenia;
    }

    @Override
    public String toString() {
        return "Lawka{" +
                "materialWytworzenia='" + materialWytworzenia + '\'' +
                '}';
    }

    public String getMaterialWytworzenia() {
        return materialWytworzenia;
    }
}
