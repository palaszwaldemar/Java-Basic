package obiektowe.exceptions;

public class Main {
    public static void main(String[] args) {
        String tekst = "Test";
        System.out.println(tekst);
        String[] tekst2 = new String[5];
        try {

            for (int i = 0; i < 10; i++) {
                tekst2[i] += "y";
            }
            tekst.endsWith("t");
        } catch(NullPointerException e) {
            System.out.println("obietk jest nullem");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wyjscie poza tablice");
        } catch (Exception e) {
            System.out.println("nieprzewidziany błąd");
            e.printStackTrace();
        }
        System.out.println(tekst + " t");
    }
}
