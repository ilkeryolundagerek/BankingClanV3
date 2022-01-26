package com.iyg.bankingclan.model;

public class DollarCurrencyImpl implements DollarCurrencyGateway {
    @Override
    public void getDollarCurrency(Long amount) {
        System.out.println(amount + " $");
    }
}
