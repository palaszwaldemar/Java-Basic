package obiektowe.enumy;

public class Demo {
    public static void main(String[] args) {
        Zakret zakret1 = new Zakret(Kierunek.OSTRO_W_LEWO);
        Zakret zakret2 = new Zakret(Kierunek.LEWO);
        Samochod samochod = new Samochod();
        samochod.jedz(zakret1);
        samochod.jedz(zakret2);

        for (Kierunek kierunek: Kierunek.values()) {
            System.out.println(kierunek.ordinal());
        }
        System.out.println(Kierunek.values()[2]);

    }
}
