package com.deepshooter.designpatterns.creational.factory.java;

public class EmployeeFactory {

    //Get the employee
    public static Employee getEmployee(String empType) {

        if (empType.equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }

}
