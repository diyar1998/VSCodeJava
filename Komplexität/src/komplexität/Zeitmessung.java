package komplexität;

public class Zeitmessung {

    private static double tuwas() {
        return Math.random();
    }

    // Linear
    public static double func1(int n) {
        double summe = 0;
        int anz = 0;
        for (int a = 0; a < n; a++) {
            summe += tuwas();
            anz++;
        }
        System.out.println("Anzahl der AufrufeF2: " + anz);
        return summe;
    }

    // Quadratisch
    public static double func2(int n) {
        double summe = 0;
        int anz = 0;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                summe += tuwas();
                anz++;
            }
        }
        System.out.println("Anzahl der AufrufeF2: " + anz);
        return summe;
    }

    // log2(n)
    public static double func6(int n) {
        double summe = 0;
        int anz = 0;

        while (n > 0) {
            summe += tuwas();
            n /= 2;
            anz++;
        }
        System.out.println("Anzahl der AufrufeF2: " + anz);
        return summe;
    }

    public static void main(String[] args) {

        StopUhr su = new StopUhr();

        su.start();
        Zeitmessung.func1(100000);
        su.stop();
        System.out.println("Fun2: (Lineare Laufzeit)" + su.getDuration() + " msec");

        su.start();
        Zeitmessung.func2(100000);
        su.stop();
        System.out.println("Fun2:  (qudratische Laufzeit)" + su.getDuration() + " msec");

        su.start();
        Zeitmessung.func6(100000);
        su.stop();
        System.out.println("Fun2:  (logarithmische Laufzeit)" + su.getDuration() + " msec");
    }
}
