package inputOutput;

import java.util.Scanner;

public class howToScanner {
    public static void main(String[] args){
        //Create a new scanner which takes input from the system
        Scanner scanner = new Scanner(System.in);

        String message = "[message] = BEFORE SCANNER";
        System.out.println(message);

        System.out.println("------------------");
        System.out.println("Write something else for program to print.");

        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        message = scanner.nextLine();
        System.out.println("------------------");

        // Print the message written by the user
        System.out.println("[message] is now "+message);

        // "something" + somethingelse is called concatenation
    }
}
