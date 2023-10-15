package com.deepshooter.designpatterns.behavioural.observer.exampleone;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<MyObserver> subscribers = new ArrayList<>();


    @Override
    public void subscribe(MyObserver myObserver) {
        subscribers.add(myObserver);
    }

    @Override
    public void unSubscribe(MyObserver myObserver) {
        subscribers.remove(myObserver);
    }

    @Override
    public void notifyChanges(String title) {

        for (MyObserver myObserver : this.subscribers) {
            myObserver.notified(title);
        }
    }

}
