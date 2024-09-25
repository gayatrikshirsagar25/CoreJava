package com.networkbill.classes;

public interface BillGenerator {
	int num = 10;
	public abstract float generatebill(int data);
	default void method2() {
		System.out.println("This is default method ");
	}
	public static void method3() {
		System.out.println("This is static method");
		
	}
	
}
