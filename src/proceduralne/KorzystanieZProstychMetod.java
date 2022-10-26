package proceduralne;//Zadanie 29

public class KorzystanieZProstychMetod {
    public static void main(String[] args) {
        Metody.wyswietlNapis();
        Metody.wyswietlPowitanie("Waldemar");
        Metody.wyswietlTekstPodanaIloscRazy("Hi", 8);
        Metody.wyswietlPowitanie("Tomasz", 31);
        Metody.wyswietlPowitanie("Konrad", 19);
        Metody.przywitajWszyskich(new String[] {"Damian", "Justyna", "Bogdan"});
        Metody.wyliczLacznaCeneTowaru(20, 5, 23);
        Metody.wyliczLacznaCeneTowaru(9, 5, 8);
    }
}
