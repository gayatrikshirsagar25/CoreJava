package com.mainpackage.billgenerator;

public abstract class bill {
	
	private int num;
	public bill(int num) {
		this.num=num;
	}
	
	public abstract float generatebill(int units);
}
