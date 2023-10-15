package com.deepshooter.designpatterns.behavioural.observer.exampleone;

public class Main {

    public static void main(String[] args){

        Subject youtubeChannel = new YoutubeChannel();

        MyObserver aman = new Subscriber("Aman");
        MyObserver raman = new Subscriber("Raman");

        youtubeChannel.subscribe(aman);
        youtubeChannel.subscribe(raman);

        youtubeChannel.notifyChanges("Learn Jetpack Compose");
        youtubeChannel.notifyChanges("Learn Kotlin");

    }

}
