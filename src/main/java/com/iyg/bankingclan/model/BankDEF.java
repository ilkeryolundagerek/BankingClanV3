package com.iyg.bankingclan.model;

public class BankDEF  extends Bank {

    public BankDEF(AccountModel accountModel) {
        super(accountModel);
    }

    @Override
    AccountModel openAccount() {
        System.out.println("OPEN ACCOUNT WITH DEF BANK");
        return accountModel;
    }
}