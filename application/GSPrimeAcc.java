package com.cg.application;


import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{

	private static final float charges=0; 
	
	
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

	
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	

}

