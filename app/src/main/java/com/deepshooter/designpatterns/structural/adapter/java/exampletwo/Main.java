package com.deepshooter.designpatterns.structural.adapter.java.exampletwo;

public class Main {


    public static void main(String[] args) {

        System.out.println("Program Started:");

        //AppleCharger appleCharger = new ChargerXYZ();

        AppleCharger appleCharger = new AdapterCharger(new ChargerABC());

        Iphone13 iphone13 = new Iphone13(appleCharger);
        iphone13.chargeIphone();

    }
}
