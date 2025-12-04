package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {
	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("C:\\IO01\\IN AND OUT JAVA PROGRAM.txt");
		char[] cArray = { 'H', 'i' };
		w.write(cArray);
		w.write(',');
		w.write("SUNILOS");
		w.close();

	}

}
