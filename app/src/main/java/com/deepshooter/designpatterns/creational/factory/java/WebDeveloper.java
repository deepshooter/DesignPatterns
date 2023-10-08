package com.deepshooter.designpatterns.creational.factory.java;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Getting Web Developer Salary.");
        return 40000;
    }
}
