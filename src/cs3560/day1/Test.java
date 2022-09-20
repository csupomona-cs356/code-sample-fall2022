package cs3560.day1;

import java.util.Scanner;

public class Test {

	// text: String
	// image: int[][]
	// audio: int[]
	
	
	public static String getInputFromKeyboard() {
		Scanner s = new Scanner(System.in);
		String msg =  s.nextLine(); //
		return msg;
	}
	
	public static int sendMessage(String msg) {
		// send the message through HTTP
		return 0;
	}
	
	public static String receiveMessage() {
		// receive the data from the network
		return "test";		
	}
	
	public static void displayMessage(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		String myMsg = getInputFromKeyboard();
		sendMessage(myMsg);
		String buffer = receiveMessage();
		displayMessage(buffer);		
	}

}
