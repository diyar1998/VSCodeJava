package medienverwaltung;

import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Objects;

abstract public class Medium implements Comparable<Medium> {

    private final int id;
    private static int zaehler;
    private String titel;
    private int jahr;

    public Medium(String titel, int jahr) {
        id = zaehler++;
        this.titel = titel;
        this.jahr = jahr;
    }

    @Override
    public int compareTo(Medium o) {
        return Integer.compare(this.getJahr(), o.getJahr());
    }

    public int alter() {
        return LocalDate.now().getYear() - jahr;
    }

    public abstract void druckeDaten(OutputStream outStream);

    public static int getZaehler() {
        return zaehler;
    }

    public static void setZaehler(int zaehler) {
        Medium.zaehler = zaehler;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || !(obj instanceof Medium))
        {
            return false;
        }
        Medium m2 = (Medium) obj;

        return hashCode() == m2.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getJahr(), this.getTitel());
    }

}
