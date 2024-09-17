package com.driver;

import java.util.HashMap;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception{
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name, balance, 5000);
       if(balance < 5000){
           throw new Exception("Insufficient Balance");
       }else {
           this.tradeLicenseId = tradeLicenseId;
       }
    }

    public void validateLicenseId() throws Exception {
        // A trade license ID is said to be valid if no two consecutive characters are same
        // If the license ID is valid, do nothing
        // If the characters of the license ID can be rearranged to create any valid license ID
        // If it is not possible, throw "Valid License can not be generated" Exception
        int n = tradeLicenseId.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<n;++i){
           hm.put(tradeLicenseId.charAt(i),hm.getOrDefault(tradeLicenseId.charAt(i),0)+1);
        }

        for(Character ch : hm.keySet()){
            if(hm.get(ch) > (n+1)/2){
                throw new Exception("Valid License can not be generated");
            }
        }

//        System.out.println("This is a valid License Id");
    }

}
