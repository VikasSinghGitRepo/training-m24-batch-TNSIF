package com.cg.framework;


public  class NormalAcc extends ShopAcc
{

	protected static float deliveryCharge=150;
	
	
	//constructor to initialize variable of ShopAcc class and this class
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("Charges are:"+deliveryCharge);
	}
	
	
	@Override
	public String toString() {
//		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
//				+ getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + "]";
		
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", charges="
		+ getCharges()+ "]";
	}
	
	
	public float getDeliveryCharge() {
		return deliveryCharge;
	}
	
	
	
}



