package com.deepshooter.designpatterns.structural.adapter.java.exampletwo;

public class Iphone13 {

    private AppleCharger appleCharger;


    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone() {

        appleCharger.chargePhone();

    }

}
