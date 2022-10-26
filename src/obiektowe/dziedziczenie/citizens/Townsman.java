package obiektowe.dziedziczenie.citizens;

public class Townsman extends Citizen{

    public Townsman(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
