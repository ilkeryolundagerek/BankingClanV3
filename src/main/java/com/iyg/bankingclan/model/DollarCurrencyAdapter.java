package com.iyg.bankingclan.model;

public class DollarCurrencyAdapter implements DollarCurrencyGateway{
    private CurrencyGateway currencyGateway;

    public DollarCurrencyAdapter(CurrencyGateway currencyGateway) {
        this.currencyGateway = currencyGateway;
    }

    @Override
    public void getDollarCurrency(Long amount) {
        System.out.println(amount + " $");
    }
}
