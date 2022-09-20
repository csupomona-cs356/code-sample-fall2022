package cs3560.day1.good;

import java.util.Scanner;

public class TextMessage implements IMessage {

	private String msg;
	
	public void getInputFromKeyboard() {
		Scanner s = new Scanner(System.in);
		this.msg = s.nextLine(); //
	}
	
	public void displayMessage() {
		System.out.println(this.msg);
	}
	
}
