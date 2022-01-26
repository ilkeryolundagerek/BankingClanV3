package com.iyg.bankingclan.service;

import com.iyg.bankingclan.entity.Account;
import com.iyg.bankingclan.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TransferServiceImpl implements TransferService{
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	@Transactional
	public void transfer(Long amount, Long a, Long b){
		Optional<Account> accountA = accountRepository.findById(a);
		Optional<Account> accountB = accountRepository.findById(b);
		System.out.println(accountRepository.findAll());
		System.out.println("Amount has been transfered from "+accountA +" to "+accountB);
		System.out.println(accountRepository.readRecord(2000l));
	}
}
