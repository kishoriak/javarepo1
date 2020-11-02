package com.training.service;

public interface AccountService {
	int searchId(int id);
	void withdrawAmt(int id, double amt);
	void depositAmt(int id, double amt);
	void checkBalance(int id);
	void addData(int ch, int g);
	void displayAll();
}
