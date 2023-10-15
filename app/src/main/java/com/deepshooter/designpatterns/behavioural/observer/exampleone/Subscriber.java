package com.deepshooter.designpatterns.behavioural.observer.exampleone;

public class Subscriber implements MyObserver{

    @Override
    public void notified() {
        System.out.println("New Video Uploaded: Notification");
    }

}
