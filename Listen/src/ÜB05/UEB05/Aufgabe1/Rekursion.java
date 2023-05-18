package ÜB05.UEB05.Aufgabe1;

public class Rekursion {

    public static void rev1(int n) {
        System.out.print(n % 10);
        if (n > 9)
        {
            rev1(n / 10);
        }
    }

    public static void rev1Iter(int n) {
        // Aufgabe 1c
        assert (n >= 0);
        while (n > 0)
        {
            System.out.print(n % 10);
            n /= 10;
        }
    }

    public static int rev2(int n) {
        if (n <= 9)
        {
            return n;
        }

        int logn = (int) Math.log10(n);
        int zehnHochLogn = (int) Math.pow(10, logn);

        return (n % 10) * zehnHochLogn + rev2(n / 10);

    }

    public static int rev2It // Aufgabe 1c


return -1;
    }

    public static void main(String[] args) {
//        rev1(1234);
//        System.out.println();
//
//        int erg = rev2(1234);
//        System.out.println(erg);
//        rev1Iter(1234);
//        System.out.println("");
        System.out.println(rev2Iter(1234));
    }
}
