package BSP03ListeMitVerkettung;

import java.util.*;

public class ListeIterator<T> implements Iterator {

    private Link<T> zeiger;
    private Link<T> ende;

    ListeIterator(Link<T> start, Link<T> ende) {
        zeiger = start;
        this.ende = ende;
    }

    @Override
    public boolean hasNext() {
        return zeiger != null;
    }

    @Override
    public T next() {
        final T daten = zeiger.daten;
        zeiger = zeiger.naechster;

        return daten;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
