package com.iyg.bankingclan.model;

public class BankABC extends Bank {

    public BankABC(AccountModel accountModel) {
        super(accountModel);
    }

    @Override
    AccountModel openAccount() {
        System.out.println("OPEN ACCOUNT WITH ABC BANK");
        return accountModel;
    }

    @Override
    void deposit(double amount) {
        accountModel.deposit(amount);
    }
}
