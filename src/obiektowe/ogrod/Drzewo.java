package obiektowe.ogrod;

import java.util.Random;

public class Drzewo {
    private final Random random = new Random();
    private int iloscOwocow = random.nextInt(901) + 100;

    void owocuj() {
        iloscOwocow += random.nextInt(99) + 1;
    }

    int zbierajOwoce() {
        int iloscOwocowZmiennaPomocnicza = iloscOwocow;
        iloscOwocow = 0;
        return iloscOwocowZmiennaPomocnicza;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "iloscOwocow=" + iloscOwocow +
                '}';
    }
}
