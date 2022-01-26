package com.iyg.bankingclan.model;

import java.util.HashMap;

public class BankAccountOperations {
    public static void depositAll(Long amount, HashMap<String, Bank> banks) {
        Double partialAmount = (double)amount / banks.size();
        for (Bank bank : banks.values()) {
            bank.deposit(partialAmount);
        }
    }
}
