package streams;

import java.util.ArrayList;

public class Streams {

    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("Diyar", 23));
        p.add(new Person("sewar", 15));
        p.add(new Person("serhad", 20));

        p.stream()
                .map(p1 -> p1.getName())
                .forEach(System.out::println);
    }

}
