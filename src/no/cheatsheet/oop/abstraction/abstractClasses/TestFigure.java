package no.cheatsheet.oop.abstraction.abstractClasses;

public class TestFigure {

    public static void main(String[] args){

        Square s = new Square();

        Figure f = s;
        System.out.println(f.area());
    }
}
