package com.iyg.bankingclan.repository;

import com.iyg.bankingclan.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface TransferRepository extends CrudRepository<Account, Long> {
	
}
