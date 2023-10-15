package com.deepshooter.designpatterns.behavioural.observer.exampleone;

public class Main {

    public static void main(String[] args){

        YoutubeChannel youtubeChannel = new YoutubeChannel();

        Subscriber aman = new Subscriber();

        youtubeChannel.subscribe(aman);

        youtubeChannel.notifyChanges();

    }

}
