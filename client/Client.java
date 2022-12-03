package com.cg.client;


import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopAcc;
import com.cg.framework.ShopFactory;


public class Client 
{
	public static void main(String[] args) 
	{
		// Step 1 - Step a
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(123, "Siddharth", 1000, true);
		gssfactory.getNewNormalAccount(111, "Shubham", 1000, 150);
		
		
		// Step 2
		GSPrimeAcc gsprime = new GSPrimeAcc();
//		gsprime.getAccNm();
//		gsprime.getAccNo();
//		gsprime.getCharges();
		// Step 4 / Step d.
		gsprime.bookProduct(1000);
		
		// Step 5 / Step e.
		gsprime.toString();
		
		// Step 3
		GSNormalAcc gsnormal = new GSNormalAcc(); 
//		gsnormal.getAccNm();
//		gsnormal.getAccNo();
//		gsnormal.getCharges();
//		gsnormal.getDeliveryCharge();
		
		// Step 4 / Step d.
		gsnormal.bookProduct(1000);
		// Step 5 / Step e.
		gsnormal.toString();
	
		

	}

}
