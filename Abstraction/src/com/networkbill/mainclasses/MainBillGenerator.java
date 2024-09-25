package com.networkbill.mainclasses;

import com.networkbill.classes.BillGenerator;
import com.networkbill.classes.Idea;
import com.networkbill.classes.VI;

public class MainBillGenerator {
	public static void main(String[] args) {
		VI vi = new VI();
		System.out.println("Your Mobile bill is "+vi.generatebill(2));
		Idea idea = new Idea();
		System.out.println("Your Mobile bill is "+idea.generatebill(5));
		System.out.println(BillGenerator.num);
		vi.method2();
		BillGenerator.method3();
	}

}
