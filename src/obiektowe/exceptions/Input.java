package obiektowe.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    int showNumber() {
        int number = 0;
        boolean isNumber = false;
        do {
            try {
              Scanner  scanner = new Scanner(System.in);
                System.out.print("Podaj liczbe: ");
                number = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("Nie wolno podawać liter");
            }
        } while (!isNumber);

        return number;
    }

    int showNumber2() {
        int number;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbe: ");
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Nie wolno podawać liter");
            number = showNumber2();
        }
        return number;
    }
}
