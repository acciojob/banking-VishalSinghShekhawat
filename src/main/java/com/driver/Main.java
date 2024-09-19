package com.driver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CurrentAccount currentAccount;
        String rearrangedId;
        int i;
        String temp;
        char[] tempArray;
//        try {
//            currentAccount = new CurrentAccount("curr", 10000.0, "AAAAAAABBBCCC");
//            currentAccount.validateLicenseId();
//            rearrangedId = currentAccount.getTradeLicenseId();
//
//            assert rearrangedId.length() == 13;
//
//            for(i = 0; i < 12; ++i) {
//               // assert rearrangedId.charAt(i) != rearrangedId.charAt(i + 1);
//                if(rearrangedId.charAt(i) == rearrangedId.charAt(i + 1)) System.out.println("Invalid answer in 1");
//            }
//
//            tempArray = rearrangedId.toCharArray();
//            Arrays.sort(tempArray);
//            temp = new String(tempArray);
//
//            assert temp.equals("AAAAAAABBBCCC");
//            if(temp.equals("AAAAAAABBBCCC")) System.out.println("All good in 1");
//        } catch (Exception var9) {
//            assert var9.getMessage().equals("Valid License can not be generated");
//            if(var9.getMessage().equals("Valid License can not be generated")) System.out.println("Exception in 1");
//        }
//
//        try {
//            currentAccount = new CurrentAccount("curr", 10000.0, "ZZY");
//            currentAccount.validateLicenseId();
//            rearrangedId = currentAccount.getTradeLicenseId();
//
//            assert rearrangedId.length() == 3;
//
//            for(i = 0; i < 2; ++i) {
//                assert rearrangedId.charAt(i) != rearrangedId.charAt(i + 1);
//                if(rearrangedId.charAt(i) == rearrangedId.charAt(i + 1)) System.out.println("Invalid answer in 2");
//            }
//
//            tempArray = rearrangedId.toCharArray();
//            Arrays.sort(tempArray);
//            temp = new String(tempArray);
//
//            assert temp.equals("YZZ");
//            if(temp.equals("YZZ")) System.out.println("All good in 2");
//        } catch (Exception var8) {
//            assert var8.getMessage().equals("Valid License can not be");
//            if(var8.getMessage().equals("Valid License can not be generated")) System.out.println("Exception in 2");
//        }
//
//        try {
//            currentAccount = new CurrentAccount("curr", 10000.0, "ZYZZ");
//            currentAccount.validateLicenseId();
//            rearrangedId = currentAccount.getTradeLicenseId();
//
//            assert rearrangedId.length() == 4;
//
//            for(i = 0; i < 3; ++i) {
//                assert rearrangedId.charAt(i) != rearrangedId.charAt(i + 1);
//                if(rearrangedId.charAt(i) == rearrangedId.charAt(i + 1)) System.out.println("Invalid answer in 3");
//            }
//
//            tempArray = rearrangedId.toCharArray();
//            Arrays.sort(tempArray);
//            temp = new String(tempArray);
//
//            assert temp.equals("YZZZ");
//            if(temp.equals("YZZZ")) System.out.println("All good in 3");
//        } catch (Exception var7) {
//            assert var7.getMessage().equals("Valid License can not be generated");
//            if(var7.getMessage().equals("Valid License can not be generated")) System.out.println("Exception in 3");
//        }

//        try {
//            currentAccount = new CurrentAccount("curr", 10000.0, "ABCABCABC");
//            currentAccount.validateLicenseId();
//            rearrangedId = currentAccount.getTradeLicenseId();
//
//            assert rearrangedId.length() == 9;
//
//            for(i = 0; i < 8; ++i) {
//                assert rearrangedId.charAt(i) != rearrangedId.charAt(i + 1);
//                if(rearrangedId.charAt(i) == rearrangedId.charAt(i + 1)) System.out.println("Invalid answer in 4");
//            }
//
//            tempArray = rearrangedId.toCharArray();
//            Arrays.sort(tempArray);
//            temp = new String(tempArray);
//
//            assert temp.equals("AAABBBCCC");
//            if(temp.equals("AAABBBCCC")) System.out.println("All good in 4");
//        } catch (Exception var6) {
//            assert var6.getMessage().equals("Valid License can not be generated");
//            if(var6.getMessage().equals("Valid License can not be generated")) System.out.println("Exception in 4");
//        }

        try {
            currentAccount = new CurrentAccount("curr", 10000.0, "BBBAAACCC");
            currentAccount.validateLicenseId();
            rearrangedId = currentAccount.getTradeLicenseId();

            assert rearrangedId.length() == 9;

            for(i = 0; i < 8; ++i) {
                assert rearrangedId.charAt(i) != rearrangedId.charAt(i + 1);
                if(rearrangedId.charAt(i) == rearrangedId.charAt(i + 1)) System.out.println("Invalid answer in 5");
            }

            tempArray = rearrangedId.toCharArray();
            Arrays.sort(tempArray);
            temp = new String(tempArray);

            assert temp.equals("AAABBBCCC");
            if(temp.equals("AAABBBCCC")) System.out.println("All good in 5");
        } catch (Exception var5) {
            assert var5.getMessage().equals("Valid License can not be generated");
            if(var5.getMessage().equals("Valid License can not be generated")) System.out.println("Exception in 5");

        }
    }}
