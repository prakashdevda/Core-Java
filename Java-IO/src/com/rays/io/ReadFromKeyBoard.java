package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyBoard {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("C:\\IO01\\IN AND OUT JAVA PROGRAM.txt"));
		InputStreamReader kb = new InputStreamReader(System.in);

		System.out.println("Typing Somthing.....");
		BufferedReader in = new BufferedReader(kb);

		String line = in.readLine();

		while (!(line.equals("quit"))) {
			out.write(line + "\n");
			line = in.readLine();
		}
		out.close();

	}

}
