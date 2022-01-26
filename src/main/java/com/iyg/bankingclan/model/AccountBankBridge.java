package com.iyg.bankingclan.model;

public class AccountBankBridge {
    public static void doWork(){
        Bank abc = new BankABC(new SavingAccount());
        Bank def = new BankDEF(new ActiveAccount());

        AccountModel active = abc.openAccount();
        active.accountType();

        AccountModel saving = def.openAccount();
        saving.accountType();
    }
}
