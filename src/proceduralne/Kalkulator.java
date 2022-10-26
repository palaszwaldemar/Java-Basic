package proceduralne;//Zadanie36

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int liczba2 = scanner.nextInt();
        System.out.print("Podaj dzialanie jakie chcesz wykonac [+ - * /]: ");
        String dzialanie = scanner.next();
        System.out.println(wykonajDzialanie(liczba1, liczba2, dzialanie));

    }
    static String wykonajDzialanie(int liczba1, int liczba2, String dzialanie) {
        switch (dzialanie) {
            case "+":
                return liczba1 + liczba2 + "";
            case "-":
                return liczba1 - liczba2 + "";
            case "*":
                return liczba1 * liczba2 + "";
            case "/":
                if (liczba2 == 0) {
                    return "Nie mozna dzielic przez 0";
                } else {
                    return liczba1 / liczba2 + "";
                }
            default:
                return "Nie ma takiego dzialania";
        }
    }
}
