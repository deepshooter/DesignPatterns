package com.deepshooter.designpatterns.creational.abstractfactory.java;


public class WebDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }

}
