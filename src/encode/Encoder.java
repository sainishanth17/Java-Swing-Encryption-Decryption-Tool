package encode;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.*;

public class Encoder extends JFrame {

	
	public static String encode(String input, String encoding) {
		
		String output = "";
		for (int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			if (encoding.equals("Numeric")) {
				if ((c == '\n')) {
					output = output + c;
				}
				if ((c == ' ')) {
					output = output + "-.";
				}
				System.out.println("numeric value of "+ c + " is " + (int)(c));
				int numeric_value = c;
				output = output + numeric_value + ".";
				
			} else if (encoding.equals("ROT13")) {
				int numeric_value = 0;
				char startingChar = 'a';
				if ((c == '\n') || (c == ' ')) {
					output = output + c;
					continue;
				} 
				if (Character.isLowerCase(c)) {
					numeric_value = (int)c - 'a';

					startingChar = 'a';
				} else {
					System.out.println("char is " + c);
					numeric_value = (int)c - 'A';
					startingChar = 'A';
				}
				int new_value = (numeric_value + 13) % 26;
				output = output + (char)(new_value + 
							startingChar);
			}
		}
		return output;
	}
	

}
