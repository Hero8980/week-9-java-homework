package allhomeworkprogramme;

import java.util.ArrayList;
// Declare following two arraylist and compare it.
public class Programme11_CompareArrayList {
    public static void main(String[] args) {
        // Declare and initialize the first ArrayList c1
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare and initialize the second ArrayList c2
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the two ArrayLists c1 and c2
        boolean isEqual = c1.equals(c2);

        // Print the result
        if (isEqual) {
            System.out.println("ArrayLists c1 and c2 are equal.");
        } else {
            System.out.println("ArrayLists c1 and c2 are not equal.");
        }
    }
}
