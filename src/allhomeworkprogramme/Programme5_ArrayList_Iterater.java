package allhomeworkprogramme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme5_ArrayList_Iterater {

    //main method
    public static void main(String[] args) {
        //arraylist
        ArrayList<String> cityList = new ArrayList();
        cityList.add("Gujrat");
        cityList.add("Bihar");
        cityList.add("London");
        cityList.add("Pune");
        cityList.add("Himachal");
        System.out.println("ArrayList: " + cityList);

        Iterator itr = cityList.iterator();
        System.out.println("Iterating through ArrayList:1 ");
        while (itr.hasNext()) { // return next element of the Arraylist
            System.out.println(itr.next());
        }
    }

    /**
     * 7.Write a Java program to test if an array list is empty or not
     */
    public static class Programme7_ArrayListEmptyOrNot {
        //Create main method
        public static void main(String[] args) {
            //Arraylist
            ArrayList<String> name = new ArrayList();
            // using boolean check if the list is empty or not
            boolean ans = name.isEmpty();
            if (ans == true) {
                System.out.println("The ArrayList is Empty");
            } else{
                System.out.println("The ArrayList is Not Empty");// ref: https://www.geeksforgeeks.org/arraylist-isempty-java-example/
            }
            name.add("Ram");
            name.add("Shyam");
            name.add("Josh");
            name.add("Jay");
            name.add("Bharat");
            System.out.println("Addition of a elements to the array list: " + name);

    // checking if List is empty or Not
            if (name.isEmpty()) {
                System.out.println("The ArrayList is empty");
            } else {
                System.out.println("The Arraylist is not empty");
            }
        }
    }
}
