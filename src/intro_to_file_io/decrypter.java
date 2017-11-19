package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class decrypter {

	public decrypter() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws IOException {
try {
	BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/encrypt.txt"));
	String line = br.readLine();
	String message = "";
	while(line != null){
		int i = Integer.parseInt(line);
String x = Character.toString((char)i);
			line = br.readLine();
			message +=x;
}
	System.out.println(message);
	}
	catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();


}
}
}
