package com.mainpackage.billgenerator;

public class RecidentialBill extends bill{
	public RecidentialBill(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float generatebill(int units) {
		return units*5;
	}

}
