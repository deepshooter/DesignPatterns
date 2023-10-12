package com.deepshooter.designpatterns.structural.facade.java.exampletwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {

        do {
            System.out.println("Welcome to Franchise Service Registration...!");
            System.out.println(" 1. KFC");
            System.out.println(" 2. McDonalds");
            System.out.println(" 3. Dominos");
            System.out.println(" 4. EXIT");
            System.out.println("Please Enter your Franchise Option Number: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            FranchiseServiceReg sp = new FranchiseServiceReg();

            switch (choice) {
                case 1: {
                    sp.BuyKFCFranchise();
                }
                break;
                case 2: {
                    sp.BuyMcDonaldsFranchise();
                }
                break;
                case 3: {
                    sp.BuyDominosFranchise();
                }
                break;
                default: {
                    System.out.println("Please Check the input and try again");
                }
                return;
            }

        } while (choice != 4);

    }

}
