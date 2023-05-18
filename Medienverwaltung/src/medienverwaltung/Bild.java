package medienverwaltung;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Objects;

public class Bild extends Medium {

    private String ort;

    public Bild(String ort, String titel, int jahr) {
        super(titel, jahr);
        this.ort = ort;
    }

    @Override
    public void druckeDaten(OutputStream outStream) {
        PrintWriter pw = new PrintWriter(outStream);
        pw.println("ID = " + super.getId() + " " + this.getOrt() + "augenommen im Jahr " + super.getJahr() + " in " + this.getOrt());
        pw.flush();
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Bild))
        {
            return false;
        }
        Bild b2 = (Bild) obj;

        return hashCode() == b2.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getOrt()) + super.hashCode();
    }

    @Override
    public String toString() {
        return "Bild{" + "Titel" + super.getTitel() + "ort=" + ort + " Jahr" + super.getJahr() + '}';
    }
}
