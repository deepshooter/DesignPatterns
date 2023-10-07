package com.deepshooter.designpatterns.creational.singleton.java;

public class SingletonExample {


    public static void main(String[] args) {

        //Eager Initialisation

        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);

        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println(instance2);

        //Lazy Initialisation

        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance3);

        Singleton instance4 = Singleton.getInstance();
        System.out.println(instance4);

        //Thread Safe Method Initialisation

        SingletonSynchronizedMethod instance5 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance5);

        SingletonSynchronizedMethod instance6 = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance6);

        //Thread Safe Block Initialisation

        SingletonSynchronized instance7 = SingletonSynchronized.getInstance();
        System.out.println(instance7);

        SingletonSynchronized instance8 = SingletonSynchronized.getInstance();
        System.out.println(instance8);


    }
}