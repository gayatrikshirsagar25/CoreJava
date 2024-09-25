package com.anonymousclass.main;

import com.anonymousclass.ArithmaticOperation;

public class TestArithmaticOperation {
	public static void main(String[] args) {
//		ArithmaticOperation add = new ArithmaticOperation() {
//			public int Operation(int op1, int op2) {
//				return op1+op2;
//			}
//		};
//		System.out.println("addition is "+add.Operation(5, 10));
//		Substraction sub = new Substraction() {
//			public int Operation(int op1, int op2) {
//				return op1-op2;
//			}
//		};
//		System.out.println("The substraction is "+sub.Operation(15, 5));
//		Multiplication mul = new Multiplication() {
//			public int Operation(int op1, int op2) {
//				return op1*op2;
//				}
//		};
//		System.out.println("The multiplication is "+mul.Operation(5, 10));
		
		
		ArithmaticOperation addition = (op1,op2)->op1+op2;
		ArithmaticOperation substracrion = (op1,op2)->op1-op2;
		ArithmaticOperation multiplication = (op1,op2)->op1*op2;
		ArithmaticOperation division = (op1,op2)->op1/op2;
		
		System.out.println("the addition is "+addition.Operation(10, 20));
		System.out.println("the substracrion is "+substracrion.Operation(10, 20));
		System.out.println("the multiplication is "+multiplication.Operation(10, 20));
		System.out.println("the division is "+division.Operation(10, 20));
}
}
