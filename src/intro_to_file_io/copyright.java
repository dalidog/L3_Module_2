package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyright {
public static void main(String[] args) {
	BufferedReader br;
	try {
		FileWriter encrypt = new FileWriter("src/intro_to_file_io/encrypt.txt", true);
		encrypt.write("\n //Copyright © 2017 by Dalia Sebat");
		encrypt.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
