package com.cg.client;

import com.cg.service.*;
import com.cg.entities.*;


public class AccountUser{
	
	public static void main(String[] args) {
		
		
		IService service= new IServiceImpl();      // created object of IServiceImpl class
		Bank bank=new Bank();
		
	
		
		//setting bank details
		bank.setIfsc(6450);
		bank.setBankName("BankOfMaharashtra");
		bank.setAccountNumber(123456789);
		bank.setBalance(1000);
		
		// setting password
		char[] password= { 'b','a','n','k','@','1','2','3'};
		bank.setPassword(password);
		
		
		// adding data into database using service package
		service.addBankAccount(bank);
		
		/*
	
		bank=service.searchBankByIFSC(6459);// first searching bank and giving object of that to bank reference
		bank.addMoney(1000);    // adding money through bankclass method
		service.addmoney(bank); // updating bank balance of bank 
		
		
		
		bank=service.searchBankByIFSC(6459); // first searching bank and giving object of that to bank reference  
		bank.withdrawMoney(500);      // withdrawing money
		service.withdrawMoney(bank);    // updating bank balance
		
		*/
		
		System.out.println("End Of Transaction ");
		
	}

}
