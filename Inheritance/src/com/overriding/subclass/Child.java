package com.overriding.subclass;

import com.overriding.superclass.Parent;

public class Child extends Parent{
	public void sleeps() {
		System.out.println("Child sleeps at 3AM");
	}
	public void wakeUp() {
		System.out.println("Child wake up at 12PM");
	}
}
