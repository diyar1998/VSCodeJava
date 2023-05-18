/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medienverwaltung;

import java.util.Comparator;

/**
 *
 * @author 49179
 */
public class ComperatorN implements Comparator<Medium> {

    @Override
    public int compare(Medium o1, Medium o2) {
        return o1.getTitel().compareTo(o2.getTitel());
    }

}
