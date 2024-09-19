package com.driver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("save", 0.0, 5.0, 50.0);

        assert savingsAccount.getName().equals("save");

        assert savingsAccount.getBalance() == 0.0;

        assert savingsAccount.getMinBalance() == 0.0;

        assert savingsAccount.getMaxWithdrawalLimit() == 5.0;

        assert savingsAccount.getRate() == 50.0;

        try {
            savingsAccount.withdraw(1.0);
        } catch (Exception var6) {
            //assert var6.getMessage().equals("Insufficient Balance");
            if(var6.getMessage().equals("Insufficient Balance")) System.out.println("code is valid");
        }

        try {
            savingsAccount.deposit(500.0);

            assert savingsAccount.getName().equals("save");

            assert savingsAccount.getBalance() == 500.0;
            System.out.println(savingsAccount.getBalance());

            assert savingsAccount.getMinBalance() == 0.0;

            assert savingsAccount.getMaxWithdrawalLimit() == 5.0;

            assert savingsAccount.getRate() == 50.0;

            savingsAccount.withdraw(1.0);

            assert savingsAccount.getName().equals("save");

            assert savingsAccount.getBalance() == 499.0;
            System.out.println(savingsAccount.getBalance());

            assert savingsAccount.getMinBalance() == 0.0;

            assert savingsAccount.getMaxWithdrawalLimit() == 5.0;

            assert savingsAccount.getRate() == 50.0;

            savingsAccount.withdraw(5.0);

            assert savingsAccount.getName().equals("save");

            assert savingsAccount.getBalance() == 494.0;
            System.out.println(savingsAccount.getBalance());

            assert savingsAccount.getMinBalance() == 0.0;

            assert savingsAccount.getMaxWithdrawalLimit() == 5.0;

            assert savingsAccount.getRate() == 50.0;
        } catch (Exception var5) {
            assert var5.getMessage().equals("Insufficient Balan");
            if(var5.getMessage().equals("Insufficient Balance")) System.out.println("code is invalid in 2");
        }

        try {
            savingsAccount.withdraw(6.0);

            assert savingsAccount.getName().equals("save");

            assert savingsAccount.getBalance() == 499.0;
            System.out.println(savingsAccount.getBalance());


            assert savingsAccount.getMinBalance() == 0.0;

            assert savingsAccount.getMaxWithdrawalLimit() == 5.0;

            assert savingsAccount.getRate() == 50.0;
        } catch (Exception var4) {
            assert var4.getMessage().equals("Maximum Withdraw Limit Exceeded");
            if(var4.getMessage().equals("Maximum Withdraw Limit Exceeded")) System.out.println("code is invalid in 3");

        }

        try {
            savingsAccount.withdraw(1000.0);

            assert savingsAccount.getName().equals("save");

            assert savingsAccount.getBalance() == 499.0;
            //System.out.println(savingsAccount.getBalance());

            assert savingsAccount.getMinBalance() == 0.0;

            assert savingsAccount.getMaxWithdrawalLimit() == 5.0;

            assert savingsAccount.getRate() == 50.0;
        } catch (Exception var3) {
            assert var3.getMessage().equals("Maximum Withdraw Limit Exceeded");
            //if(var3.getMessage().equals("Maximum Withdraw Limit Exceeded")) System.out.println("code is vvalid in 4");
        }
    }}
