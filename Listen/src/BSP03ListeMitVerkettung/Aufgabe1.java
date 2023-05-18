package BSP03ListeMitVerkettung;

public class Aufgabe1 {

    public static void main(String[] args) {
        Link<String> mittlereElemnt = new Link<>("Test", new Link<>("letzter", null));
        Link<String> anfang = new Link<>("Erster", mittlereElemnt);
    }
}
