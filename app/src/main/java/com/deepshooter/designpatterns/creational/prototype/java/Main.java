package com.deepshooter.designpatterns.creational.prototype.java;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating object using Prototype Design Pattern:");

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.4.11");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);

        //We want new object of network connection

        NetworkConnection newNetworkConnection = networkConnection.clone();
        System.out.println(newNetworkConnection);

        NetworkConnection otherNetworkConnection = networkConnection.clone();
        System.out.println(otherNetworkConnection);


    }

}
