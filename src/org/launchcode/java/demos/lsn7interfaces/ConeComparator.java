package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone>{

        // Comparator:
    @Override
    public int compare(Cone o1, Cone o2) {
        int costComparison = ~((int) (o2.getCost() - o1.getCost()));
        return costComparison;
    }
}
