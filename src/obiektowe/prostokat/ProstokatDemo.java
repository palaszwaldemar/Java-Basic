package obiektowe.prostokat;//zadanie 41 wariant trudniejszy, 42, 43

public class ProstokatDemo {
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(3, 5, "$");
        Prostokat prostokat2 = new Prostokat(5, 0, "|");

        //zadanie 41 wariant trudniejszy
        /*prostokat1.szerokosc = 5;
        prostokat1.wysokosc = 3;
        prostokat1.wypelnienie = "$";

        prostokat2.szerokosc = 10;
        prostokat2.wysokosc = 5;
        prostokat2.wypelnienie = "|";*/

        prostokat1.drukujProstokat();
        prostokat2.drukujProstokat();

        System.out.println(prostokat1);
        System.out.println(prostokat2);
    }
}
