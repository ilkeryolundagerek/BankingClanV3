package com.iyg.bankingclan.service;

import com.iyg.bankingclan.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
	
	Account open(Account account);
	
	List<Account> findAllAccounts();
	
	Optional<Account> findOne(Long accountId);
	
}
