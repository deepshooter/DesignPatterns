package com.deepshooter.designpatterns.behavioural.iterator.exampleone;

public class Main {

    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Avinash", "22"));
        userManagement.addUser(new User("Harsh", "23"));
        userManagement.addUser(new User("Ankit", "25"));
        userManagement.addUser(new User("Gautam", "35"));

        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }

}
