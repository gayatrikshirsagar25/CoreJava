package com.showmessage.mainclasses;

import com.showmessage.interfaces.ShowMessage;

public class MainShowMessage {
	public static void main(String[] args) {
		ShowMessage msg =
				()-> {
			System.out.println("Hello");
			System.out.println("hi");
			
		};
		msg.displaymessage();
		}

}
