package com.deepshooter.designpatterns.creational.abstractfactory.java;


public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Developer");
        return "Web Developer";
    }
}
