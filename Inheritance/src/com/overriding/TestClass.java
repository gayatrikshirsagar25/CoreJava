package com.overriding;

import com.overriding.subclass.Child;
import com.overriding.superclass.Parent;

public class TestClass {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1= new Child();
		p1.wakeUp();
		c1.sleeps();
		c1.wakeUp();

	}

}
