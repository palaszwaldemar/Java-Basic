package proceduralne;//Zadanie 33

import java.util.Scanner;

public class BibliotekiStatyczne {
    public static void main(String[] args) {
        System.out.println((int) Math.pow(2, 5));
        System.out.println(czyOstatniZnakToCyfra("Ala ma kota1"));

        String text = "123a";

      /*  for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);
            if (!Character.isDigit(znak)) {
                return -1;
            }
        }*/
      //  Integer.parseInt();
        //Pattern Matcher ->

    }
    static boolean czyOstatniZnakToCyfra(String tekst) {
        return Character.isDigit(tekst.charAt(tekst.length() - 1));
    }

}
