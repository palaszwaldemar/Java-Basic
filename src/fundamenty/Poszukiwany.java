package fundamenty;//Zadanie 19

public class Poszukiwany {
    public static void main(String[] args) {
        int[] tablicaLiczb = new int[4];
        String[] tablicaTekstow = new String[2];

        tablicaLiczb[0] = 26;
        tablicaLiczb[1] = 12;
        tablicaLiczb[2] = 1990;
        tablicaLiczb[3] = 2000000;

        tablicaTekstow[0] = "Waldemar";
        tablicaTekstow[1] = "Palasz";

        System.out.println("\n" + tablicaLiczb[0] + "-" + tablicaLiczb[1] + "-" + tablicaLiczb[2] + " zbiegl wiezien "
        + tablicaTekstow[0] + " " + tablicaTekstow[1] + "!\nNagroda za przyprowadzenie: " + tablicaLiczb[3] + " $!");
    }
}
