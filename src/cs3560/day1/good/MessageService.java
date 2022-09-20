package cs3560.day1.good;

import java.util.Scanner;

public class MessageService {

	// text: String
	// image: int[][]
	// audio: int[]
	
	void test111() {
		
	}
	
	
	public static int sendMessage(IMessage msg) {
		// send the message through HTTP
		return 0;
	}
	
	public static IMessage receiveMessage() {
		// receive the data from the network
		return null;		
	}
		
	
	public static void main(String[] args) {
		IMessage textMessage = new ImageMessage();
		textMessage.getInputFromKeyboard();
		sendMessage(textMessage);
		IMessage buffer = receiveMessage();
		buffer.displayMessage();		
	}

}
