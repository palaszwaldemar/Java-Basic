package obiektowe.telewizor;

public class TelewizorDemo {
    public static void main(String[] args) {
        Telewizor telewizorSamsung = new Telewizor("Samsung", 1599.99, 40);
        Telewizor telewizorSony = new Telewizor("Sony", 4500, 45);

        System.out.println(telewizorSamsung);
        System.out.println(telewizorSony);

        System.out.println(telewizorSamsung.wyswietlNapisPowitalny("Witamy w swiecie SAMSUNG"));
        System.out.println(telewizorSony.wyswietlNapisPowitalny("SONY WITA"));
        telewizorSony.wlaczPolaczenieZTelefonem();

        System.out.println(telewizorSony);

        Paragon paragon1 = new Paragon(telewizorSamsung);

        System.out.println(paragon1);
    }
}
