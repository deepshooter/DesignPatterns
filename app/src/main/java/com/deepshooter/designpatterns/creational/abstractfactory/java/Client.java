package com.deepshooter.designpatterns.creational.abstractfactory.java;

public class Client {

    public static void main(String[] args) {

        //Get Android Developer
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee1.name();

        //Get Web Developer
        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee2.name();

        //Get Manager
        Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
        employee3.name();

    }

}
