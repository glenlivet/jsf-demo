package org.ikgroup.service;

import java.io.Serializable;
import java.util.List;

import org.ikgroup.domain.Account;

public interface AccountService extends Serializable{
	
	public List<Account> findAll();
	
	public Account save(Account account);
	
	public Account findById(long id);
	
	public boolean isValidAccount(Account account);
	
	public void delete(long id);
	
}
