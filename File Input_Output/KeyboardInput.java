package file.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardInput {

	public static void main(String[] args) throws Exception {
 
		String target = "D:\\helooo.txt";
		// Open file
		FileWriter file = new FileWriter(target);
		// Enable line by line write
		PrintWriter out = new PrintWriter(file);

		// Open keyboard
		InputStreamReader kb = new InputStreamReader(System.in);

		// Enable line by line read
		BufferedReader in = new BufferedReader(kb);

		// Read line from keyboard
		String line = in.readLine();

		// Exit loop if used types "quit"
		while (!line.equals("quit")) {
			out.print(line);// Write to file
			line = in.readLine();// Read next line
		}
		// Close streams
		//file.close();
		out.close();
		kb.close();
	}

}



