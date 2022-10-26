package obiektowe.ogrod;

import java.util.Random;

public class Kwiat {
    private final String kolor;
    private  boolean kwitnie;

    public Kwiat() {
        Random random = new Random();
        String[] kolory = {"czerwony", "zielony", "niebieski", "zolty"};
        kolor = kolory[random.nextInt(kolory.length)];
    }

    public Kwiat(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Kwiat{" +
                "kolor='" + kolor + '\'' +
                ", kwitnie=" + kwitnie +
                '}';
    }

    void podlej() {
        kwitnie = true;
    }

    public void setKwitnie(boolean kwitnie) {
        this.kwitnie = kwitnie;
    }
}
