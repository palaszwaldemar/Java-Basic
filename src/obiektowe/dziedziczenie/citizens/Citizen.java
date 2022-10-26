package obiektowe.dziedziczenie.citizens;

public abstract class Citizen {
    private String imie;

    public Citizen(String imie) {
        this.imie = imie;
    }

    abstract boolean canVote();

    public String getImie() {
        return imie;
    }
}
