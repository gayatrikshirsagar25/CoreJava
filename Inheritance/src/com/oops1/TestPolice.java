package com.oops1;

public class TestPolice {
	public static void main(String[] args) {
		PoliceMan p = new PoliceMan();
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.salary);
		//System.out.println(p.blackMoney); // private access only within class
	}

}
