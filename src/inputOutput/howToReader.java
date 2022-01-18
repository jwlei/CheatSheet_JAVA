package inputOutput;

import java.util.Scanner;

public class howToReader {
    public static void main(String[] args){

        //Assign text from scanner
        Scanner scanner = new Scanner(System.in);
        String message = "EMPTY TEXT";

        System.out.println("[message] = " + message);
        System.out.println("---------------------------");
        System.out.println("Write your something");

        //Assigning a STRING message to user input
        message = scanner.nextLine();

        if (message.equals("Joachim")) {
            System.out.println("Hei " + message);
        } else {
            System.out.println("[message] = " + message);
        }

        //Assign number from scanner
        int i = 0;
        System.out.println("i = " + i);
        System.out.println("Assign a new number");

        //Use Integer.valueOf to convert string number to int

        //Integer.parseInt(input)       :   Only accepts integers
        //Scanner.hasNextInt(input)     :   Checks if there is an integer in the input, returns T/F
        //Character.isDigit()           :   Checks if current character of an array/string is a number.
        String temp = scanner.nextLine();
        int retry = 0;
        int limit = 3;
        boolean isInt = false;

        System.out.println("Write a number");

        while(!isInt){
            try {
                Integer.parseInt(temp);
                isInt = true;
                i = Integer.parseInt(temp);
                System.out.println("i = " + i);

            }
            catch (NumberFormatException e) {
                System.out.println(temp + " is not a valid number. Only numbers here." );
                if (retry >= limit){
                    throw e;
                }
                retry++;
                System.out.println("You have used " + retry + " out of " + limit + " tries.");
                System.out.println("Please input a number ");
                temp = scanner.nextLine();


            }
        }
    }
}
