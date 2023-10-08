package com.deepshooter.designpatterns.creational.factory.java;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Android Developer Salary.");
        return 50000;
    }

}
