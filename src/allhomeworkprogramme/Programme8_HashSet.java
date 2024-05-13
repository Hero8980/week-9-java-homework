package allhomeworkprogramme;

import java.util.HashSet;

public class Programme8_HashSet {
    //Create main method
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();//HashSet object called number
        // adding value to the set
        number.add(1);
        number.add(3);
        number.add(4);
        number.add(7);
        number.add(8);

        //showing which number are between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " It was found in the set ");
            } else {
                System.out.println(i + " It was not found in the set");
            }
        }
    }
}