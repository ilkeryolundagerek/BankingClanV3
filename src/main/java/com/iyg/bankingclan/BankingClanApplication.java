package com.iyg.bankingclan;

import com.iyg.bankingclan.model.AccountBankBridge;
import com.iyg.bankingclan.model.CurrencyImpl;
import com.iyg.bankingclan.model.DollarCurrencyAdapter;
import com.iyg.bankingclan.service.ProxyTransferServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingClanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingClanApplication.class, args);
        //AccountBankBridge.doWork();
        CurrencyImpl tl = new CurrencyImpl();
        tl.getCurrency(1000L);
        DollarCurrencyAdapter adapter = new DollarCurrencyAdapter(tl);
        adapter.getDollarCurrency(1500L);
        ProxyTransferServiceImpl service = new ProxyTransferServiceImpl();
        service.transfer(1000L,1000L,2000L);
    }
}
