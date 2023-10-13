package com.deepshooter.designpatterns.structural.adapter.java.exampleone;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookHolder extends LibraryDetails implements LibraryCard {
    public void giveLibraryDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the Library account holder name :");
            String readerName = br.readLine();
            System.out.print("Enter the account number of the library:");
            long accNo = Long.parseLong(br.readLine());
            System.out.print("Enter the Library name :");
            String libraryName = br.readLine();
            setAccHolderName(readerName);
            setAccNumber(accNo);
            setLibraryName(libraryName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getLibraryCard() {
        long accNo = getAccNumber();
        String readerName = getAccHolderName();
        String libraryName = getLibraryName();
        return ("The Account number " + accNo + " of " + readerName + " in " + libraryName + " Library is valid and authenticated for issuing the Library card. ");
    }

}