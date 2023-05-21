package VL7;

public class AnonymTest {
  public static void drueckeWerttabelle(Berechnung b) {
    for (int i = 0; i <= 10; i++) {
      System.out.println("f(" + i * 1.0 + ") = " + b.berechne((double) i));
    }
  }

  // innerklasse
  public class InnerQuadrat implements Berechnung {
    public double berechne(double i) {
      return i * i;
    }
  }

  public static void main(String[] args) {

    /*
     * //Anonyme Klasse
     * drueckeWerttabelle(new Berechnung() {
     * public double berechne(double i) {
     * return i * i;
     * }
     * });
     */

    /*
     * //Ohne Anonyme Klasse
     * drueckeWerttabelle(new Quadrat());
     */
    // Mit einer Innereklasse
    InnerQuadrat at = new AnonymTest().new InnerQuadrat();
    drueckeWerttabelle(at);
  }
}
