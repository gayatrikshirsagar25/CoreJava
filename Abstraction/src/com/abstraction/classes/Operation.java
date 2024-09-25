package com.abstraction.classes;

public class Operation extends Transaction{

	public void creditAmt(float amt) {
		this.bal+=amt;
		
	}

	public void debitAmt(float amt) {
		this.bal-=amt;
		
	}
	public void CheckBal() {
		System.out.println("Your Bal:" +this.bal );
	}

	

}
