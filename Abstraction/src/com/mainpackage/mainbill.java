package com.mainpackage;

import com.mainpackage.billgenerator.RecidentialBill;
import com.mainpackage.billgenerator.StateWise;
import com.mainpackage.billgenerator.bill;
import com.mainpackage.billgenerator.industrialbill;

public class mainbill {

	public static void main(String[] args) {
		bill bb = new StateWise(100);
//		float amt = bb.generatebill(100);
//		System.out.println("the bill is: "+amt );
		System.out.println("the Industrial bill is: "+bb.generatebill(100) );
		bill b1 = new RecidentialBill(100);
		System.out.println("the Recidential bill is: "+b1.generatebill(100) );
	}

}
