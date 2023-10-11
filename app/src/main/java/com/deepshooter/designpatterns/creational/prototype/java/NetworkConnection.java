package com.deepshooter.designpatterns.creational.prototype.java;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;

    private List<String> domains = new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData() {
        this.importantData = "Very Very Important Data";

        domains.add("www.google.com");
        domains.add("www.meta.com");
        domains.add("www.instagram.com");
        domains.add("www.github.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //It will take 5 Minutes
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();

            // Logic for cloning: For Deep Copy
            NetworkConnection networkConnection = new NetworkConnection();
            networkConnection.setIp(this.getIp());
            networkConnection.setImportantData(this.getImportantData());

            for (String d : this.getDomains()) {
                networkConnection.getDomains().add(d);
            }

            return networkConnection;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
