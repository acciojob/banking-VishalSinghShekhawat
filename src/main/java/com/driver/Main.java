package com.driver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("acc1", 1000.0, 1.0, 10.0);
        Double diff = savingsAccount.getSimpleInterest(5) - 1500.0;

        if(Math.abs(diff) <= 1.0) System.out.println("Code is valid");
        else System.out.println("Code is not working properly " + Math.abs(diff));
    }}
