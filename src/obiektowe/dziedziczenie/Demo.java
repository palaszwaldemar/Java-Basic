package obiektowe.dziedziczenie;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Slon slon1 = new Slon();
        Slon slon2 = new Slon("Edi", 12, 87);
        Tygrys tygrys1 = new Tygrys();
        Tygrys tygrys2 = new Tygrys("Maniek", 45, "czerwony");

        slon1.bieganie();
        slon1.trabienie();
        tygrys1.ryczenie();
        tygrys2.skok();
        tygrys1.jedz();
        slon1.jedz();

        Opiekun opiekun = new Opiekun();
        System.out.println("---------------");
        opiekun.nakarmZwierze(slon2);
        opiekun.nakarmZwierze(tygrys1);
        System.out.println("---------------");
        //polimorfizm
        Zwierze zwierze3 = slon1;
        zwierze3.jedz();
        zwierze3 = tygrys1;
        zwierze3.jedz();
        ArrayList<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(slon1);
        zwierzeta.add(tygrys1);
        //Zwierze zwierze = new Zwierze();//NIE MOZNA ROBIC ObIEKTU Z KLASY ABSTRAKCYJNEJ
        //zwierzeta.add(zwierze);
        System.out.println(zwierzeta.size());
        Zwierze jakiesZwierze = new Malpa("Karol", 67);
        zwierzeta.add(jakiesZwierze);
        opiekun.nakarmZwierze(jakiesZwierze);
        jakiesZwierze = new Tygrys();
        //jakiesZwierze.chodzPoDrzewach();

        System.out.println(jakiesZwierze instanceof Zwierze); // z tej lub dziedziczacej po niej
        System.out.println(jakiesZwierze.getClass().equals(Zwierze.class)); //z tej konkretnej klasy

    }
}
