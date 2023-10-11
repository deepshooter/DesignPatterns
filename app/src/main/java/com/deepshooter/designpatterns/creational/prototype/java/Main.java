package com.deepshooter.designpatterns.creational.prototype.java;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating object using Prototype Design Pattern:");

        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.4.11");
        networkConnection.loadImportantData();



        //We want new object of network connection
        NetworkConnection newNetworkConnection = networkConnection.clone();
        NetworkConnection otherNetworkConnection = networkConnection.clone();


        System.out.println(networkConnection);

        networkConnection.getDomains().remove(0);

        System.out.println(networkConnection);

        System.out.println(newNetworkConnection);
        System.out.println(otherNetworkConnection);


    }

}
