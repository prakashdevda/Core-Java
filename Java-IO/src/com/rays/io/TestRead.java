package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class TestRead {
	public static void main(String[] args) throws IOException {
	
		FileReader reader = new FileReader("C:\\IO\\Hello.txt");
		int ch =reader.read();
		char chr;
		while (ch != -1) {
			chr = (char) ch;
			System.out.print(chr);
			ch =reader.read();
		}
		reader.close();
	
	}

}
