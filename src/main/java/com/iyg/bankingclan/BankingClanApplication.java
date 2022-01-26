package com.iyg.bankingclan;

import com.iyg.bankingclan.model.AccountBankBridge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingClanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingClanApplication.class, args);
        AccountBankBridge.doWork();
    }
}
