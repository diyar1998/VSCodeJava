package ÜB04;

// Abstrakte Datenstruktur Stack, realisiert als Java-Interface
interface StackI<E> {

    public void push(E element);

    public E pop();

    public E top();

    public boolean isEmpty();
}
