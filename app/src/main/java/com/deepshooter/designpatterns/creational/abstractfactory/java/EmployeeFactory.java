package com.deepshooter.designpatterns.creational.abstractfactory.java;



public class EmployeeFactory {

    //Get Employee
    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }

}
