package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\Devda01\\1713626168371.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Devda01\\AnayaDevda.jpg");
		int ch =in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
			
		}
		out.close(); in.close();
	}

}
