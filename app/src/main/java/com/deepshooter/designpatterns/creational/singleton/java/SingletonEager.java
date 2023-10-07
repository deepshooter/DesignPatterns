package com.deepshooter.designpatterns.creational.singleton.java;

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
