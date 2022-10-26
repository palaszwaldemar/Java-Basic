package proceduralne;//Zadanie 34

public class PolaStatyczne {
    private static final String dna = "cttaatgaatttgagttcgtaacattagac";

    public static void main(String[] args) {
        System.out.println(dna);
        System.out.println(toUpperCase());
        System.out.println(changeSign());
        System.out.println(cutString());
        System.out.println(space3Sign());
    }

    static String toUpperCase() {
        return PolaStatyczne.dna.toUpperCase();
    }

    static String changeSign() {
        return PolaStatyczne.dna.replace('a', 't').replace('g', 'c');
    }

    static String cutString() {
        return PolaStatyczne.dna.substring(0, 15);
    }

    static String space3Sign() {
        String dna2 = "";
        for (int i = 0; i < PolaStatyczne.dna.length(); i++) {
            if (i % 3 == 0 && i != 0) {
                dna2 += " ";
            }
            dna2 += PolaStatyczne.dna.charAt(i);
        }
        return dna2;
    }
}
