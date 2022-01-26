package com.iyg.bankingclan.model;

public abstract class AccountModel {
    protected Long id;
    protected String name;
    protected Long balance;
    abstract AccountModel open();
    abstract void accountType();
    abstract void deposit(double amount);
}
