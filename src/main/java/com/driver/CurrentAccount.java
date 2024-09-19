package com.driver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
        //System.out.println(tradeLicenseId);
        for(int i=0;i<n;++i){
           hm.put(tradeLicenseId.charAt(i),hm.getOrDefault(tradeLicenseId.charAt(i),0)+1);
        }


        for(Character ch : hm.keySet()){
            if(hm.get(ch) > (n+1)/2){
                throw new Exception("Valid License can not be generated");
            }
        }
        //System.out.println(hm.size());
        boolean flag = true;
        for(int i=0;i<n-1;++i){
            if(tradeLicenseId.charAt(i) == tradeLicenseId.charAt(i+1)) flag = false;
        }

        if(!flag) {
            char[] alpha = new char[hm.size()];
            int[] freq = new int[hm.size()];
            int i = 0;
            for (Character ch : hm.keySet()) {
                if (i < hm.size()) {
                    alpha[i] = ch;
                    freq[i] = hm.get(ch);
                    ++i;
                }
            }


            for (int j = hm.size() - 1; j > 0; --j) {
                for (int k = 0; k < j; ++k) {
                    int a = freq[k];
                    int b = freq[k + 1];

                    if (a > b) {
                        freq[k + 1] = a;
                        freq[k] = b;

                        char temp = alpha[k];
                        alpha[k] = alpha[k + 1];
                        alpha[k + 1] = temp;
                    }
                }
            }
            //System.out.println(alpha);
            //System.out.println(Arrays.toString(freq));

            char[] ans = new char[n];
            //System.out.println(freq.length);

            for (int j = freq.length - 1; j >= 0; --j) {
                int r = freq[j];
                //System.out.println(j +" "+r);
                while (r > 0) {
                    for (int k = 0; k < n; ++k) {

                        if (ans[k] == '\u0000' && r > 0) {
                            //System.out.println(j +" "+r+" "+k );
                            ans[k] = alpha[j];
                            ++k;
                            --r;
                        }
                    }
                    --r;

                }
            }
            // System.out.println(ans);

            String s = "";
            for (int j = 0; j < n; ++j) {
                s += ans[j];
            }


            tradeLicenseId = s;
        }
       // System.out.println(tradeLicenseId);


//        System.out.println("This is a valid License Id");


    }
    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public void setTradeLicenseId(String tradeLicenseId) {
        this.tradeLicenseId = tradeLicenseId;
    }

}
