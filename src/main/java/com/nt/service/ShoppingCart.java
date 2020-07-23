package com.nt.service;


public class ShoppingCart {

	public float calculateSingleProductBillAmt(float price, float qty)
	{
		//float billAmt=0.0f;
		if(price<=0.0f || qty<=0.0f)
			throw new IllegalArgumentException("invalid inputs");
	     return price*qty;
	}
}
