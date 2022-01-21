package no.cheatsheet.exceptionHandling;

import java.io.FileNotFoundException;

public class FinallyBlock {
    public static void main(String[] args) {

        catchMethod();
    }

    public static void catchMethod() {

        try {
            exceptionMethod();
            FileNotFoundException e = new FileNotFoundException("file not found");
            throw e;
        } catch (FileNotFoundException e) {
            System.out.println("caught FileNotFoundException");
        } finally {
            System.out.println("Finally runs even if we dont catch runtimeException");
        }

        System.out.println("This prints after finally");
    }

    public static void exceptionMethod() {

        RuntimeException e = new RuntimeException("Exception");

        throw e;
    }
}
