package com.account.service;

import com.account.bin.Account;

public interface AccountService {
void addData(int ch,int i);
Account searchAccount(int id);
boolean transaction(int ids, int cho, double am) ;

}
