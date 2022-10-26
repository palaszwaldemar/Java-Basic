package fundamenty;

public class Brudnopis {
    public static void main(String[] args) {
        int liczba = 896;
        int liczbaObrotow = 0;
        if (liczba >= 128) {
            for(int i = 127; i < liczba; i += 256) {
                liczbaObrotow++;
            }
            System.out.println("Ilosc obrotow: " + liczbaObrotow);
        } else if (liczba <= -129) {
            for(int i = -128; i < liczba; i -= 256) {
                liczbaObrotow++;
            }
            System.out.println("Ilosc obrotow: " + liczbaObrotow);
        } else {
            System.out.println("Ilosc obrotow: " + liczbaObrotow);
        }
    }
}
