package com.iyg.bankingclan.service;

public class ProxyTransferServiceImpl implements TransferService {
    private TransferServiceImpl actual;

    @Override
    public void transfer(Long amount, Long a, Long b) {
        if (actual == null) {
            actual = new TransferServiceImpl();
        }
        System.out.println("Para aktarımı yapılıyor...");
        actual.transfer(amount, a, b);
    }
}
