package com.iyg.bankingclan.model;

import java.util.HashMap;

public class MainAccount {
    private HashMap<String,Bank> banks= new HashMap<>();
    private void depositAll(Long amount){
        BankAccountOperations.depositAll(amount,banks);
    }

    public void addBankAccount(String key,Bank bank){
        banks.put(key,bank);
    }
}
