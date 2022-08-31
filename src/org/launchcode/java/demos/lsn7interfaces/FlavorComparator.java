package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

//Step one - Create a sorting algorithm

public class FlavorComparator implements Comparator<Flavor> {
    // Comparator:
    @Override
    public int compare(Flavor o1, Flavor o2) {
        //"compareTo": Returns an integer. That integer will be either positive/negative/zero -
        //- depending on which argument should come first

        // Here, it is comparing Flavor 'o1' vs Flavor 'o2'
        return o1.getName().compareTo(o2.getName());


        //See Step 2 in Main
    }
}
