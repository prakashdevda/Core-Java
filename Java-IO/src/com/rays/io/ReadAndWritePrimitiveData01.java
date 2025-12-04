package com.rays.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData01 {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Devda01\\Devda Ji01.txt"));
		out.writeInt(23);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(2.3);
		out.close();
		
		DataInputStream in = new DataInputStream(new FileInputStream("C:\\Devda01\\Devda Ji01.txt"));
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
	}

}
