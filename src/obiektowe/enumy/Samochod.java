package obiektowe.enumy;

public class Samochod {

    public void jedz(Zakret zakret){
        Kierunek kierunek = zakret.getKierunek();
        switch (kierunek){
            case LEWO:
                System.out.println("skręcam w lewo");
                break;
            case PRAWO:
                System.out.println("skręcam w prawo");
                break;
            case OSTRO_W_LEWO:
                System.out.println("zwalniam i skrecam w lewo");
                break;
        }

        System.out.println(kierunek.getIloscStopni());
        System.out.println(kierunek.getKorektaPredkosci());
    }



}
