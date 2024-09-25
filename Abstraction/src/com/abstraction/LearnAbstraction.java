package com.abstraction;

public abstract class LearnAbstraction {

	
	void br() {
		System.out.println("This is break");
	}
	abstract void seats();

}
abstract class logic extends LearnAbstraction{

	void seats() {
		System.out.println("It shoud have 4 seats");
		
	}
	
}
class l1 extends logic{
	
}
