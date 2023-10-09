package com.deepshooter.designpatterns.creational.builder.java;

public class Main {

    public static void main(String[] args) {

        User user1 = new User.UserBuilder()
                .setEmailId("avinashm720@gmail.com")
                .setUserId("ID100")
                .setUserName("Avinash")
                .build();

        System.out.println(user1);

        User user2 = User.UserBuilder.builder()
                .setUserId("ID200")
                .setEmailId("okay@gmail.com")
                .setUserName("Okay")
                .build();

        System.out.println(user2);

    }

}
