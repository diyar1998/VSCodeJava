package medienverwaltung;

public class Main {

    public static void main(String[] args) {
        Audio a = new Audio("InterpretA1", 32, "Title1", 1993);
        Audio a2 = new Audio("InterpretA1", 32, "Title1", 1993);
        Bild b = new Bild("Dortmund", "Title1", 1993);
        Bild b2 = new Bild("Bochum", "Title2", 1991);
        System.out.println(a.equals(a2));

    }
}
