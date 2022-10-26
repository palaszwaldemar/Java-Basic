package obiektowe.dziedziczenie.citizens;

public class Peasant extends Citizen{

    public Peasant(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
