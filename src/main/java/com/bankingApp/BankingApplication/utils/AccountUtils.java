package com.bankingApp.BankingApplication.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXIST_CODE="001";
    public static final String ACCOUNT_CREATION_CODE="200";
    public static final String ACCOUNT_EXIST_MESSAGE="User already exists!";
    public static final String ACCOUNT_CREATION_MESSAGE="User Registered successfully!";


    public static String generateAccountNumber(){
        Year currYear=Year.now();
        int min=100000;
        int max=999999;
        int randomNum=(int)Math.floor(Math.random()*(max-min+1)+min);
        String year=String.valueOf(currYear);
        String randomNumber=String.valueOf(randomNum);
        StringBuilder accountNumber=new StringBuilder();
        return accountNumber.append(year).append(randomNumber).toString();

    }
}
