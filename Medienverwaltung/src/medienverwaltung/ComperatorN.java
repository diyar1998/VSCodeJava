
package medienverwaltung;

import java.util.Comparator;

public class ComperatorN implements Comparator<Medium> {

    @Override
    public int compare(Medium o1, Medium o2) {
        return o1.getTitel().compareTo(o2.getTitel());
    }

}
