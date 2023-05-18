package medienverwaltung;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Manu {

    static Medienverwaltung mw = new Medienverwaltung();

    private static void Ausgabe() {
        System.out.println("Medionverwaltung"
                + "\n1.Audio aufnehmen"
                + "\n2.Biild aufnehmen"
                + "\n3.Zeige alle Medien"
                + "\n4.Zeige neues Medium"
                + "\n5.Berechne durchschnittliches Erscheinungsjahr"
                + "\n6.Beenden\n\nGib ein Zahl ein von 1-6!\n");
    }

    public static void main(String[] args) {
        while (true)
        {
            Ausgabe();
//            int in = Integer.parseInt(JOptionPane.showInputDialog(null, "Gib ein Zahl ein von 1-6!"));
            Scanner sc = new Scanner(System.in);

            int in = -1;
            try
            {
                in = sc.nextInt();
            } catch (Exception e)
            {
//                JOptionPane.showConfirmDialog(null, "Bitte ein Gültiges Wert eingeben!", "Kein Gültiges Eingabe", -1);
                System.out.println("Bitte ein Gültiges Wert eingeben!");
            }
            if (in >= 1 || in <= 6)
            {
                switch (in)
                {
                    case 1:
                        int dauer = 0,
                         jahr = 0;

                        String interpret = JOptionPane.showInputDialog(null, "Interpret:");
                        String titel = JOptionPane.showInputDialog(null, "Titel:");
                        dauer = LeseEinZahl("Dauer");
                        jahr = LeseEinZahl("Jahr");

                        mw.aufnehmen(new Audio(interpret, dauer, titel, jahr));

                        break;
                    case 2:
                        String ort = JOptionPane.showInputDialog(null, "Ort:");
                        String titelB = JOptionPane.showInputDialog(null, "title:");
                        int jahrB = 0;

                        jahrB = LeseEinZahl("Jahr");
                        mw.aufnehmen(new Bild(ort, titelB, jahrB));
                        break;
                    case 3:
                        mw.zeigeMedien();
                        break;
                    case 4:
                        mw.sucheNeuesMedium();
                        break;
                    case 5:
                        System.out.println(mw.berchneErscheinungsjahr());
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static int LeseEinZahl(String message) {
        while (true)
        {
            try
            {
                return Integer.parseInt(JOptionPane.showInputDialog(null, message));

            } catch (HeadlessException | NumberFormatException e)
            {
                JOptionPane.showConfirmDialog(null, "Bitte ein Gültige eingeben!", "Kein Gültige eingabe", -1);
            }
        }
    }
}
