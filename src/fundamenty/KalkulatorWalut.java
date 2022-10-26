package fundamenty;//Zadanie 7

public class KalkulatorWalut {
    public static void main(String[] args) {
        double kwotaWZlotowkach = 23.0;
        double kursDolara = kwotaWZlotowkach * 0.25;
        double kursEuro = kwotaWZlotowkach * 0.22;
        System.out.println("\nKwota " + kwotaWZlotowkach + " to " + kursDolara + " dolarow");
        System.out.println("\nKwota " + kwotaWZlotowkach + " to " + kursEuro + " euro");
    }
}
