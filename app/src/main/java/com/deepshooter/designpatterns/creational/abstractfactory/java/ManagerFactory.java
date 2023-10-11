package com.deepshooter.designpatterns.creational.abstractfactory.java;

public class ManagerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }

}
