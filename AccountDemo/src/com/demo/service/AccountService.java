package com.demo.service;

public interface AccountService {
	void addData(int ch, int i);
	boolean withdrawAmount(double amount, int id);
	boolean depositAmount(double amount, int id);
	

}
