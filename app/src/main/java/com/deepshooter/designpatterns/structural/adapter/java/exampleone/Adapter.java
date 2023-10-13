package com.deepshooter.designpatterns.structural.adapter.java.exampleone;


public class Adapter {

    public static void main(String[] args) {
        LibraryCard targetInterface = new BookHolder();
        targetInterface.giveLibraryDetails();
        System.out.print(targetInterface.getLibraryCard());
    }

}