package com.iyg.bankingclan.repository;

import com.iyg.bankingclan.entity.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
	
	Account findAccountByName(String name);
	
	@Query("FROM Account where id=?1")
	Account readRecord(Long id);
}
