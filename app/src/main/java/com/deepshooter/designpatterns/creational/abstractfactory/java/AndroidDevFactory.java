package com.deepshooter.designpatterns.creational.abstractfactory.java;

public class AndroidDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }

}
