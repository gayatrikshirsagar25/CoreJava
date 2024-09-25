package com.inheritance;

public class Animal {

		int age = 4;
		void walk() {
			System.out.println("animal walks on 4 legs");
		}

	}
	class cat extends Animal{
		void makeNoice() {
			System.out.println("The cat Meows");
		}
	}
	class Dog extends Animal{
		void makeNoice() {
			System.out.println("The dog Barks");
		}
	}


