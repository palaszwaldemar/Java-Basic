package obiektowe.kolekcje.listy;

import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {
        Integer liczba = 10;  //autoboxing
        int liczba2 = liczba; //inboxing
        //char, int, double, float, boolean, short, byte, long



        ArrayList<Double> lista = new ArrayList<>();
        lista.add(2.0);
        lista.add(3.0);
        lista.add(3.0);
        lista.add(3.0);
        lista.add(3.0);
        lista.add(3.0);
        //lista.add("asd");

        lista.remove(0);
        System.out.println(lista.size());
        double liczba3 =  lista.get(1);
        System.out.println(liczba3);

        for (Double aDouble : lista) {
            System.out.println(aDouble);
        }

//        lista.remove(34);
        lista.contains(3.0);
        ArrayList<Double> liczby = new ArrayList<>(lista);
        liczby.add(66.);
        liczby.add(77.);
        liczby.add(88.);
//        liczby.removeAll(lista);
        liczby.retainAll(lista);
        //liczby.addAll(lista);
        System.out.println(liczby);
        ArrayList<ArrayList<String>> listaList = new ArrayList<>();
    }
}
