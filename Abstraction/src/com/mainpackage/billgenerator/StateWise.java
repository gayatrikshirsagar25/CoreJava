package com.mainpackage.billgenerator;

public class StateWise extends industrialbill{

	public StateWise(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	public float generatebill(int units) {
		return units*16.30f;
		
	}
}
