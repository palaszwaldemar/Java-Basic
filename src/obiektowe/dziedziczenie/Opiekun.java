package obiektowe.dziedziczenie;

public class Opiekun {
    /*void nakarmTygrysa(Tygrys tygrys) {
        tygrys.jedz();
        System.out.println("tygrys nakarmiony");
    }

    void nakarmSlonia(Slon slon){
        slon.jedz();
        System.out.println("slon nakarmiony");
    }*/

    void nakarmZwierze(Zwierze zwierze) {
        zwierze.jedz();
      /*  if (zwierze instanceof Slon) {
            Slon slon =(Slon) zwierze;
            slon.trabienie();
        } else if (zwierze instanceof Tygrys) {
            Tygrys tygrys = (Tygrys) zwierze;
            tygrys.ryczenie();
        }*/
        zwierze.dajGlos();
        System.out.println("Zwierze nakarmione");
    }
}
