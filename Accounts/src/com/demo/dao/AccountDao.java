package com.demo.dao;

import com.demo.exceptions.LessAmountException;

public interface AccountDao {

	boolean depositSaving(int id, double amt);

	boolean depositCurrent(int id, double amt);

	boolean withdarwSaving(int id, double amt) throws LessAmountException;

	boolean withdarwCurrent(int id, double amt) throws LessAmountException;

	Double balanceEnqSaving(int id);

	Double balanceEnqCurrent(int id);

	Double minBalSaving(int id);

	Double minBalCurrent(int id);

	Double intrateSaving(int id);

	Double intrateCurrent(int id);

}
