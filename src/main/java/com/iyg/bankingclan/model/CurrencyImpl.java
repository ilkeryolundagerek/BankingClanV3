package com.iyg.bankingclan.model;

import lombok.Data;

@Data
public class CurrencyImpl implements CurrencyGateway {
    private Long amount;
    @Override
    public void getCurrency(Long amount) {
        this.amount = amount;
        System.out.println(amount + " TL");
    }
}
