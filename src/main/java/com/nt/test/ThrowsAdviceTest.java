package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingCart;
//https://github.com/sureshparmar042/SpringByNataraz.git
public class ThrowsAdviceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		ShoppingCart proxy=null;
		//create container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		proxy=ctx.getBean("shopping", ShoppingCart.class);
		//invoked method
		//float billAmt=0.0f;
		try {
		 System.out.println("billAmt is::"+proxy.calculateSingleProductBillAmt(1000, 2));
			
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		System.out.println("________________________________________________________________");
		try {
			 System.out.println("billAmt is::"+proxy.calculateSingleProductBillAmt(1000, 0));
				
			} catch (IllegalArgumentException iae) {
				iae.printStackTrace();
			}
          //close the Cotainer
		((AbstractApplicationContext) ctx).close();
	}

}
