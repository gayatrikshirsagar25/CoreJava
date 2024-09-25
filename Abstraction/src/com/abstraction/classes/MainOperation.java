package com.abstraction.classes;

public class MainOperation {
	public static void main(String[] args) {
		Operation op = new Operation();
		op.creditAmt(100);
		op.CheckBal();
		op.debitAmt(50);
		op.CheckBal();
	}

}
