package no.cheatsheet.exceptionHandling.trycatchfinally;

import java.util.Scanner;

public class TryCatchBlock  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();
        int i = 0;
        int retry = 0;
        int limit = 3;
        boolean isInt = false;

        //While boolean is false loop for "retries".
        while(!isInt){
            //IF SUCCESS DO
            try {
                Integer.parseInt(temp);
                isInt = true;
                i = Integer.parseInt(temp);
                System.out.println("i = " + i);

            }

            //IF FAILURE DO
            catch (NumberFormatException e) {
                System.out.println(temp + " is not a valid number. Only numbers here." );

                //INCREASE TRY COUNTER
                if (retry >= limit){
                    throw e;
                }
                retry++;
                System.out.println("You have used " + retry + " out of " + limit + " tries.");
                System.out.println("Please input a number ");
                temp = scanner.nextLine();
                continue;

            }
        }
    }

}
