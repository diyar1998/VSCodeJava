package medienverwaltung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testen {

    public static void main(String[] args) {
        List<Medium> liste = new ArrayList<>();
        liste.add(new Bild("", "a", 1999));
        liste.add(new Bild("", "v", 1999));
        liste.add(new Bild("", "s", 1997));
        liste.add(new Bild("", "v", 1997));
        liste.add(new Bild("", "b", 1997));
        liste.add(new Bild("", "s", 1998));
        Collections.sort(liste, new ComperatorN());
        // Collections.sort(liste);
        for (Medium medium : liste) {
            System.out.println(medium.getTitel());
            System.out.println(medium.getJahr());
        }
        System.out.format("%12s %f\n", "testsetsefs", 587.21);
        System.out.format("%-12s %f", "testsetsefs", 587.21);

    }
}
