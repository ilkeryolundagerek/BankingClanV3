package com.iyg.bankingclan.model;

public class SavingAccount  extends AccountModel{
    @Override
    AccountModel open() {
        System.out.println("ACCOUNT OPEN: SAVING");
        return new SavingAccount();
    }

    @Override
    void accountType() {
        System.out.println("INFO: SAVING ACCOUNT");
    }
}
