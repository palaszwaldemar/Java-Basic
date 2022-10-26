package obiektowe.kolekcje.listy;

import java.util.ArrayList;
import java.util.List;

public class ListaImion {
    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>();
        imiona.add("Justyna");
        imiona.add("Tomasz");
        imiona.add("Olga");
        imiona.add("Wojciech");
        imiona.add("Weronika");

        System.out.println(imiona);
        System.out.println(imiona.get(0));
        imiona.set(1, "Marcin");
        imiona.remove(3);

        ArrayList<String> imiona2 = new ArrayList<>();
        imiona2.add("Franciszek");
        imiona2.add("Daria");
        imiona2.addAll(imiona);

        for (String imie : imiona2) {
            System.out.print(imie.toUpperCase() + " ");
        }
        System.out.println();

        for (String imie : imiona2) {
            if (imie.endsWith("a")) {
                System.out.print(imie + " ");
            }
        }


        List<String> nowaLista = new ArrayList<>(List.of("Justyna", "Olga", "Tomasz"));
        System.out.println(nowaLista.getClass());
        nowaLista.add("abc");

    }
}
