package proceduralne;//Zadanie 32

public class MetodyKlasyString {
    public static void main(String[] args) {
        String tekst = "Ala nie miala kota";
        System.out.println(tekst.toUpperCase());
        int ilosc = tekst.length();
        System.out.println(ilosc);
        System.out.println(tekst.charAt(0));
        tekst = tekst.toUpperCase();
        System.out.println(tekst);
        boolean czyZawieraSlowoNie = tekst.contains("nie");
        System.out.println(czyZawieraSlowoNie);
        System.out.println(tekst.substring(4, 13));
        System.out.println(tekst.substring(6));
        System.out.println(tekst.charAt(tekst.length() - 1));
        System.out.println(tekst.concat("\n").repeat(5));
    }
}
