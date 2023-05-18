package medienverwaltung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Medienverwaltung {

    List<Medium> m = new ArrayList<>();

    public void aufnehmen(Medium e) {
        this.m.add(e);
    }

    public void zeigeMedien() {
        Collections.sort(m);
        for (Medium medium : m)
        {
            System.out.println(medium);
        }
    }

    public void sucheNeuesMedium() {
        Collections.sort(m);
        System.out.println(m.get(0));
    }

    public double berchneErscheinungsjahr() {
        if (m.isEmpty())
        {
            return 0.0;
        }
        double sum = 0;
        for (Medium medium : m)
        {
            sum += medium.getJahr();
        }
        return sum / m.size();
    }

}
