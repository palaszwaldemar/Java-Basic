package obiektowe.dziedziczenie.citizens;

import java.util.ArrayList;

public class TownDemo {
    public static void main(String[] args) {
        ArrayList<Citizen> citizens = new ArrayList<>();
        citizens.add(new King("Artur"));
        citizens.add(new Peasant("Tomasz"));
        citizens.add(new Soldier("Adam"));
        citizens.add(new Townsman("Jacek"));
        citizens.add(new Soldier("Witek"));

        Town town = new Town(citizens);
        System.out.println(town.howManyCanVote());

        town.whoCanVote();

    }
}
