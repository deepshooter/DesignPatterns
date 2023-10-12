package com.deepshooter.designpatterns.structural.facade.java.examplethree;

public class FacadePatternDemo {

    public static void main(String[] args){

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }

}
