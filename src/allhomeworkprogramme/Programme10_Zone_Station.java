package allhomeworkprogramme;

import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
public class Programme10_Zone_Station {
    //create main method
    public static void main(String[] args) {
        Programme10_Zone_Station obj = new Programme10_Zone_Station();
        obj.southKensington();
    }

    //create method
    public void southKensington() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter line name ");
        String input = scanner.next();

        //Switch statement
        switch (input) {
            case "Piccadilly":
            case "District":
            case "Circle":
                System.out.println("Line Pass through South Kensington");
                break;

            default:

                System.out.println("Line not passing from South Kensington");
                scanner.close();
        }
    }
}
