package proceduralne;

import java.util.Locale;

public class Concatenation {
    public static void main(String[] args) {
        String napis = "abc";
       napis= napis.toUpperCase();
        System.out.println(napis);


       /* for (int i = 0; i < 500_000; i++) {
            napis += "a";
        }*/
        System.out.println(napis);

        StringBuilder napis2 = new StringBuilder();

        for (int i = 0; i < 10_000_000; i++) {
            napis2.append("a");
        }
        System.out.println(napis2.length());
    }
}
