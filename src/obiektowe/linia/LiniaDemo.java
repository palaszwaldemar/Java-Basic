package obiektowe.linia;//zadanie 41,42,43

public class LiniaDemo {
    public static void main(String[] args) {
        Linia linia1 = new Linia(5, "*");
        Linia linia2 = new Linia(10, "+");
        Linia linia3 = new Linia(7, "^");

        //zadanie 41
        /*linia1.dlugosc = 5;
        linia1.wypelnienie = "*";
        linia2.dlugosc = 10;
        linia2.wypelnienie = "+";
        linia3.dlugosc = 7;
        linia3.wypelnienie = "^";*/

        linia1.wydrukujLinie();
        linia2.wydrukujLinie();
        linia3.wydrukujLinie();

        System.out.println(linia1);
        System.out.println(linia2);
        System.out.println(linia3);
    }
}
