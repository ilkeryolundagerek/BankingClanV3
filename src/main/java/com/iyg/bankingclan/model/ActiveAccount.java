package com.iyg.bankingclan.model;

public class ActiveAccount extends AccountModel{
    @Override
    AccountModel open() {
        System.out.println("ACCOUNT OPEN: ACTIVE");
        return new ActiveAccount();
    }

    @Override
    void accountType() {
        System.out.println("INFO: ACTIVE ACCOUNT");
    }

    @Override
    void deposit(double amount) {
        balance += (long)amount;
    }
}
