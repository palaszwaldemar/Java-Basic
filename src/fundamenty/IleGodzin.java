package fundamenty;//Zadanie 6

public class IleGodzin {
    public static void main(String[] args) {
        int minuty = 1;
        int sekundy = minuty * 60;
        double godziny = (double) minuty / 60;

        System.out.println(minuty + " minut to " + sekundy + " sekund lub " + godziny + " godzin");
    }
}
