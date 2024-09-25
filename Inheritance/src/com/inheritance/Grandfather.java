package com.inheritance;

public class Grandfather {

	void read() {
		System.out.println("I know reading");
	}
}
class Father extends Grandfather{
	void write() {
		System.out.println("I am writing");
	}
	
}
class Son extends Father{
	void useMob() {
		System.out.println("I can use Android");
	}
}
