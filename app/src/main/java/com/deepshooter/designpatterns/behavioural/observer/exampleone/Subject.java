package com.deepshooter.designpatterns.behavioural.observer.exampleone;

public interface Subject {

    void subscribe(MyObserver myObserver);

    void unSubscribe(MyObserver myObserver);

    void notifyChanges(String title);

}
