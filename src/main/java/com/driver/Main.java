package com.driver;

public class Main {
    public static void main(String[] args) {
      BankAccount b1 = new BankAccount("Vishal",1130,1100);
      b1.deposit(100);
        System.out.println(b1.getBalance());
        try {
            b1.withdraw(100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(b1.getBalance());

        CurrentAccount c1 = null;
        try {
            c1 = new CurrentAccount("Banti",5500,"ABABCAA");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            c1.validateLicenseId();
            System.out.println("");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}