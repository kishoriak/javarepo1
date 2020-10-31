package com.demo.service;

public interface Service {
	boolean withdrawAmount(float amount, int id);
	void depositAmount(float amount, int id);
	void displayData();
	void addData(int choice, int ind);
}
