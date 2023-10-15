package com.deepshooter.designpatterns.behavioural.observer.exampleone;

public class Subscriber implements MyObserver {


    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello : "+this.name+", New Video Uploaded: "+title);
    }

}
