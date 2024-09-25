package com.inheritance;

public class College extends School{
	int age =18;
	
	void CurrentAge() {
		int age =27;
		System.out.println("My current age is "+age);
		System.out.println("My current age is "+this.age);
		System.out.println("My current age is "+super.age);
	}

	public static void main(String[] args) {
		College myCollege = new College();
		myCollege.CurrentAge();

	}

}
