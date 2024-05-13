package allhomeworkprogramme;

import java.util.ArrayList;

public class Programme6_RetriveAnElement {
    //Create main method
    public static void main(String[] args) {
        // create ArrayList
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);

        list.remove(4); // removes specific index from print statement
        for (int data : list) {
            System.out.println(data);
        }
        System.out.println("After Removing value from the Index 4");

    }
}
