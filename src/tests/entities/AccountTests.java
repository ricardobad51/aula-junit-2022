package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import junit.framework.Assert;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L,0.0);
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	//TDD FAZ ESSE PRIMEIRO DEPOIS FAZER O CODIGO.

	public void depositShouldDoNothingWhenNegativeAmount() {

		double expectedValue = 100.0;
		Account acc = new Account(1L,0.0);
		double amount = -200.0;
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
}
