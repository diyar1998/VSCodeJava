package ÜB04;

public class ArrayStack<E> implements StackI<E> {
    // Array, in dem die Elemente des Stacks gespeichert werden.
    // Das oberes Ende des Stacks liegt an Position pos-1.
    // Ein Array mit Elementen vom Typ E kann zwar deklariert, aber
    // nicht �ber new erzugt werden (Java-Mangel)!

    private Object[] st;

    // N�chste freie Position im Array
    // Gleichzeitig Anzahl der im Array/Stack gespeicherten Elemente
    private int pos;

    // Erzeugt ein Stack-Objekt, in dem maximal size Elemente
    // abgespeichert werden k�nnen
    public ArrayStack(int size) {
        st = new Object[size];
    }

    // Legt �bergebenes Element auf den Stack, sofern noch Platz
    // vorhanen ist. Das Element wird an Position pos gespeichert.
    @Override
    public void push(E element) {
        // TODO
        if (pos != st.length)
        {
            st[pos] = element;
            pos++;
        }
    }

    // Holt oberstes Element vom Stack, sofern der Stack nicht leer ist.
    @Override
    public E pop() {
        // TODO

        E temp = (E) st[pos - 1];
        st[pos - 1] = null;
        pos--;
        return temp;
    }

    // Gibt oberstes Element auf dem Stack zur�ck, sofern der Stack nicht
    // leer ist. Bei leerem Stack wird null zur�ckgegeben.
    @Override
    public E top() {
        // TODO
        return (E) st[pos - 1];
    }

    // Gibt true zur�ck, falls der Stack leer ist
    @Override
    public boolean isEmpty() {
        // TODO
        return pos == 0;
    }
}
