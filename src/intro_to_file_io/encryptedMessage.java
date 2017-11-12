package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class encryptedMessage {

	public encryptedMessage() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	takeAnswer();
}
public static void takeAnswer() {
	String useranswer = JOptionPane.showInputDialog("Give me a message");
Encrypt(useranswer);
}
public static void Encrypt(String useranswer) {
	for (int i = 0; i < useranswer.length(); i++) {
		char character = useranswer.charAt(i);
		int ascii = (int) character;
		try {
			FileWriter encrypt = new FileWriter("src/intro_to_file_io/encrypt.txt", true);
			String ascii2 = "" + ascii;
			encrypt.write(ascii2 + "\n");
			System.out.println(ascii);
			encrypt.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	System.out.println(useranswer);
}
}
