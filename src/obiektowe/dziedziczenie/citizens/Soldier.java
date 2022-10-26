package obiektowe.dziedziczenie.citizens;

public class Soldier extends Citizen{

    public Soldier(String imie) {
        super(imie);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
