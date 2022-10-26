package fundamenty;//Zadanie 8

public class WskaznikBmi {
    public static void main(String[] args) {
        int waga = 50;
        double wzrost = 1.78;
        double wskaznikBmi = waga / (wzrost * wzrost);

        System.out.println("\nWaga wynosi: " + waga);
        System.out.println("Wzrost wynosi: " + wzrost);
        System.out.print("Wskaznik BMI wynosi: " + wskaznikBmi + ". ");
        if (wskaznikBmi > 24.9) {
            System.out.print("Nadwaga");
        } else if (wskaznikBmi < 18.5) {
            System.out.print("Niedowaga");
        } else {
            System.out.print("Waga prawidlowa");
        }
    }
}
