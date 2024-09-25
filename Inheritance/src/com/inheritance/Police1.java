package com.inheritance;

import com.oops1.PoliceMan;

public class Police1 extends PoliceMan{

	public static void main(String[] args) {
		PoliceMan p1 = new PoliceMan();
		System.out.println(p1.name);
		Police1 s1 = new Police1();
		System.out.println(s1.salary);

	}

}
