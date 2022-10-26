package obiektowe.dom;

public class DomDemo {
    public static void main(String[] args) {
        Pokoj pokoj1 = new Pokoj();
        Okno[] okna = new Okno[] {new Okno(), new Okno(), new Okno(), new Okno()};
        Lozko lozko = new Lozko(10);
        Pokoj pokoj2 = new Pokoj(lozko, okna);
        Pokoj[] pokoje = new Pokoj[] {pokoj1, pokoj2};
        Dom dom = new Dom(pokoje);
        System.out.println(dom);
        pokoj1.posprzataj();
        System.out.println(dom);
    }
}
