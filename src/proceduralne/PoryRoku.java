package proceduralne;//Zadanie37

import java.util.Scanner;

public class PoryRoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzien: ");
        int dzien = scanner.nextInt();
        System.out.print("Podaj miesiac: ");
        int miesiac = scanner.nextInt();

        System.out.println(zwrocPoreRoku(dzien, miesiac));

    }

    static String zwrocPoreRoku(int dzien, int miesiac) {
        if (dzien > 31) {
            return "Nie ma takiego dnia";
        } else {
            switch (miesiac) {
                case 1, 2:
                    return "Zima";
                case 3:
                    if (dzien < 21) {
                        return "Zima";
                    } else {
                        return "Wiosna";
                    }
                case 4, 5:
                    return "Wiosna";
                case 6:
                    if (dzien < 21) {
                        return "Wiosna";
                    } else {
                        return "Lato";
                    }
                case 7, 8:
                    return "Lato";
                case 9:
                    if (dzien < 23) {
                        return "Lato";
                    } else {
                        return "Jesien";
                    }
                case 10, 11:
                    return "Jesien";
                case 12:
                    if (dzien < 22) {
                        return "Jesien";
                    } else {
                        return "Zima";
                    }
                default:
                    return "Nie ma takiego miesiaca";
            }
        }
    }
}
