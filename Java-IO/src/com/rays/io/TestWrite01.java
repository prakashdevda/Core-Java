package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestWrite01 {
	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("C:\\Devda01\\Devda Ji01.txt");
		char[] cArray = {'I','A','M'};
		w.write(cArray);
		w.write(',');
		w.write("Prakash Devda");
		w.close();
	}

}
