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
		br = new BufferedReader(new FileReader("src/intro_to_file_io/encrypt.txt"));
		String line = br.readLine();
		String verylongstring = "";
		while(line != null) {
			verylongstring +=line+ "\n";
line = br.readLine();
		}
		verylongstring+="//Copyright © 2017 by Dalia Sebat";
		System.out.println(verylongstring);
		FileWriter encrypt = new FileWriter("src/intro_to_file_io/encrypt.txt");
		encrypt.write(verylongstring);
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
