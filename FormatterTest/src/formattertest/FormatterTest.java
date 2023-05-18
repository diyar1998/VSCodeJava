package formattertest;

import java.util.Formatter;
import javax.swing.JOptionPane;

public class FormatterTest {

    public static void main(String[] args) {
        System.out.format("%2$s\n%1$s\n%3$s\n", "Beta", "Alpha", "Gamma");
        for (int i = 0; i < 8; i++) {
            System.out.format("2 hoch %d ist %f%n", i, Math.pow(2, i));
        }

        String eingabe = JOptionPane.showInputDialog(null, "Operand");
        int x = Integer.parseInt(eingabe);
        Formatter formatter = new Formatter();
        formatter.format("%d * %d = %d", x, x, x * x);
        JOptionPane.showMessageDialog(null, formatter.toString());
        formatter.close();
        System.out.println(" fsa");
    }
}
