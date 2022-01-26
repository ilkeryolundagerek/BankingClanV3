package com.iyg.bankingclan.model;


public abstract class Bank {
    private String name;
    private String address;

    protected AccountModel accountModel;

    public Bank(AccountModel accountModel) {
        this.accountModel = accountModel;
    }
    abstract AccountModel openAccount();
    abstract void deposit(double amount);
}
