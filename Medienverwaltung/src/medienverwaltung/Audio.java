package medienverwaltung;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

public class Audio extends Medium {

    private String interpret;
    private int dauer;

    public Audio(String interpret, int dauer, String titel, int jahr) {
        super(titel, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    @Override
    public void druckeDaten(OutputStream outStream) {
        PrintWriter pw = new PrintWriter(outStream);
        pw.println("ID = " + super.getId() + "" + this.getInterpret() + "von " + this.getTitel() + " aus " + super.getJahr() + " Spieldauer:"
                + this.getDauer() + " sek");
        pw.flush();
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj)))
        {
            return false;
        }
        if (!(obj instanceof Audio))
        {
            return false;
        }
        Audio a2 = (Audio) obj;

        return hashCode() == a2.hashCode();
//        return this.getInterpret().equals(a2.interpret) && this.getDauer() == a2.getDauer();
    }
//
//    @Override
//public int hashCode(){
//return 7 * name.hashCode()
//+ 11 * new Double(gehalt).hashCode();
//}
//@Override
//public int hashCode(){
////null-safe
//return 3 * Objects.hashCode(name)
//+ 7 * new Double(gehalt).hashCode();
//}

    @Override
    public int hashCode() {
        return Objects.hash(this.getDauer(), this.getInterpret()) + super.hashCode();
    }

    @Override
    public String toString() {
        return "Audio{" + "Titel= " + super.getTitel() + " Interpret= " + getInterpret() + "Dauer= " + dauer + " Jahr= " + +super.getJahr() + '}';
    }
}
