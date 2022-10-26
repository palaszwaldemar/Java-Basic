package obiektowe.ogrod;

import java.util.Arrays;
import java.util.Random;

public class Pies {
    private final String imie;
    private final String[] sztuczki;

    public Pies(String imie, String[] sztuczki) {
        this.imie = imie;
        this.sztuczki = sztuczki;
        System.out.println(3);
    }

    public Pies(String imie) {
        this(imie, new String[] {"daj lape"});
        System.out.println(2);
    }

    public Pies() {
        this("Bruno");
        System.out.println(1);
    }

    void bawSie() {
        Random random = new Random();
        System.out.println("Pies o imieniu " + imie + " wykonuje sztuczke: " + sztuczki[random.nextInt(sztuczki.length)]);
    }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                ", sztuczki=" + Arrays.toString(sztuczki) +
                '}';
    }
}
