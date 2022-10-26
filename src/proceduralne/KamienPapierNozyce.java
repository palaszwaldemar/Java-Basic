package proceduralne;

import java.util.Random;
import java.util.Scanner;

public class KamienPapierNozyce {

 private static final int KAMIEN = 1;
 private static final int PAPIER = 2;
 private static final int NOZYCE = 3;


    public static void main(String[] args) {

        System.out.println("\nZapraszam do gry w KAMIEN, PAPIER, NOZYCE\n");
        wyswietlDostepneOpcje();
        System.out.println();
        int wyborUzytkownika;
        int wyborKomputera;
        do {
            System.out.print("Wybierz opcje: ");
            wyborUzytkownika = wybierzOpcje();
            wyborUzytkownika = sprawdzPoprawnoscWybranejOpcji(wyborUzytkownika);
            System.out.print("Wybrales ");
            wyswietlWybranaOpcje(wyborUzytkownika);
            System.out.println("\nTeraz komputer losuje...");
            wyborKomputera = wylosujOpcje();
            System.out.print("Komputer wybral ");
            wyswietlWybranaOpcje(wyborKomputera);
            if (wyborUzytkownika == wyborKomputera) {
                System.out.println("\nMamy dokrywke!\n");
            }
        } while (wyborUzytkownika == wyborKomputera);
        wyswietlWynikKonfrontacji(wyborUzytkownika, wyborKomputera);
    }

    static void wyswietlDostepneOpcje() {
        System.out.println("Opcje do wyboru\t\t1. KAMIEN\n\t\t\t\t\t2. PAPIER\n\t\t\t\t\t3. NOZYCE");
    }

    static int wybierzOpcje() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int wybierzPoprawnaOpcje() {
        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();
        if (czyPoprawna(wybor)) {
            return wybierzPoprawnaOpcje();
        }
        return wybor;
    }

    private static boolean czyPoprawna(int opcja){
        return opcja != KAMIEN && opcja != PAPIER && opcja != NOZYCE;
    }

    static int wylosujOpcje() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    static void wyswietlWybranaOpcje(int liczba) {
        switch (liczba) {
            case KAMIEN -> System.out.println("KAMIEN");
            case PAPIER -> System.out.println("PAPIER");
            case NOZYCE -> System.out.println("NOZYCE");
        }
    }

    static void wyswietlWynikKonfrontacji(int wyborUzytkownia, int wyborKomputera) {
        switch (wyborUzytkownia) {
            case KAMIEN:
                switch (wyborKomputera) {
                    case PAPIER -> System.out.println("Niestety przegrales :( PAPIER pokonuje KAMIEN");
                    case NOZYCE -> System.out.println("Gratulacje! KAMIEN pokonuje NOZYCE");
                }
                break;
            case PAPIER:
                switch (wyborKomputera) {
                    case KAMIEN -> System.out.println("Gratulacje! PAPIER pokonuje KAMIEN");
                    case NOZYCE -> System.out.println("Niestety przegrales :( NOZYCE pokonuja PAPIER");
                }
                break;
            case NOZYCE:
                switch (wyborKomputera) {
                    case KAMIEN -> System.out.println("Niestety przegrales :( KAMIEN pokonuje NOZYCE");
                    case PAPIER -> System.out.println("Gratulacje! NOZYCE pokonuja PAPIER");
                }
        }
    }

    static int sprawdzPoprawnoscWybranejOpcji(int wyborUzytkownika) {
        while (wyborUzytkownika != KAMIEN && wyborUzytkownika != PAPIER && wyborUzytkownika != NOZYCE) {
            System.out.print("Niepoprawny wybor. Wybierz ponownie: ");
            wyborUzytkownika = wybierzOpcje();
        }
        return wyborUzytkownika;
    }
}
