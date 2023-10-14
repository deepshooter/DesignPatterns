package com.deepshooter.designpatterns.structural.adapter.java.exampletwo;

public class ChargerABC implements AndroidCharger{

    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your Android Phone is Charging.");
    }

}
