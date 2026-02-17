import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program asks the user for their party affiliation
        // Democrat, Republic, or Independent
        // Outputs a menu giving the option of D, R, or I
        // If one of those options isn't picked it chooses Other
        // Test for the four options using a cascaded if

        Scanner in = new Scanner(System.in);

        System.out.print("Enter party affiliation ([D]emocrat, [R]epublican, [I]ndependent): ");
        String choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("Donkey!.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("Elephant");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("Person");
        } else {
            System.out.println("Other");
        }

    }
}