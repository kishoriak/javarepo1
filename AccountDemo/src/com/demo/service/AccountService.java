package com.demo.service;

public interface AccountService {
	void addData();
	boolean withdrawAmount(double amount, int id);
	boolean depositAmount(double amount1, int id1);
}
