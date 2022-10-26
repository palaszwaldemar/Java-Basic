package obiektowe.dziedziczenie.citizens;

import java.util.ArrayList;

public class Town {
    private ArrayList<Citizen> citizens;

    public Town(ArrayList<Citizen> citizens) {
        this.citizens = citizens;
    }

    int howManyCanVote() {
        int counterWhoCanVote = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counterWhoCanVote++;
            }
        }
        return counterWhoCanVote;
    }

    void whoCanVote() {
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getImie());
            }
        }
    }
}
