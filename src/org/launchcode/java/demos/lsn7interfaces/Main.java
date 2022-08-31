package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.System.*;

//See Step 1 in FlavorComparator

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        //                          STEP TWO
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
                //STEP 2a: CREATE A COMPARATOR OBJECT
        Comparator comparator = new FlavorComparator();

                //STEP 2b: CALL THE 'SORT' METHOD ON 'FLAVORS' AND PASS THE COMPARATOR OBJECT AS THE ARGUMENT

        flavors.sort(comparator);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        Comparator coneCostComparator = new ConeComparator();
        cones.sort(coneCostComparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        out.println("Flavors\n");
        for(Flavor flavor:flavors) {
            out.println(flavor.getName());
        }
        out.println("\n");
        out.println("Cones\n");
        for(Cone cone:cones) {
            out.println(cone.getName()+" " + cone.getCost());
        }
}
}
