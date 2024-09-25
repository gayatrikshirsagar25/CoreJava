package com.abstraction.classes;

public abstract class Transaction {
	
	protected int bal;
//	public Transaction(int bal) {
//		this.bal=bal;
//	}
//	public void creditAmt(int amt) {
//		this.bal+=amt;
//	}
//	public void debitAmt(int amt) {
//		this.bal-=amt;
//	}
	public abstract void creditAmt(float amt);
	public abstract void debitAmt(float amt);

}
