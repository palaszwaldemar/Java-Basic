package proceduralne;//Zadanie35

import java.util.Scanner;

public class InstrukcjeWarunkoweSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("W ktora strone chcesz sie udac\n\tpolnoc\n\tpoludnie\n\twschod\n\tzachod");
        System.out.print("Twoj wybor: ");
        String decyzja = scanner.next();
        System.out.println(czteryStronySwiata(decyzja));
    }

    static String czteryStronySwiata(String stronaSwiata) {
        return switch (stronaSwiata) {
            case "polnoc" -> "Ruszasz na polnoc!";
            case "poludnie" -> "Wsiadasz na kon i jedziesz przez gory na poludnie";
            case "wschod" -> "Wyruszyłeś do stolicy przez las na wschodzie, po drodze zostałeś\n" +
                    "napadnięty przez bandytów, rozpoczyna się walka!";
            case "zachod" -> "Wybierasz sie pieszo w strone ganicy na zachod";
            default -> "Nie ma takiej strony swiata";
        };
    }
}
