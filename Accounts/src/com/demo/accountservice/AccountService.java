package com.demo.accountservice;

import com.demo.exceptions.LessAmountException;

public interface AccountService {
	
	boolean depositAmt();

	boolean balanceEnquiry();

	boolean minBalance();
	
	boolean withdrawAmt() throws LessAmountException;

	boolean intRate();
}
