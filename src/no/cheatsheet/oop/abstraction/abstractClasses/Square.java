package no.cheatsheet.oop.abstraction.abstractClasses;

    //inherits from Figure
    public class Square extends Figure{
        private int height;
        private int width;

        //We override Figure's area method and instead use this class'
        @Override
        public double area(){
            return height * width;
        }
    }

