package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestFile {

	public static void main(String[] args) {

		File f = new File("C:\\IO\\Hello.txt");

		if (f.exists()) {
			System.out.println("file found");
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println("-----------Access Permition---------");
			System.out.println("Writable:" +f.canWrite());
			System.out.println("Readable:" +f.canRead());
			System.out.println("Is File:" +f.isFile());
			System.out.println("Is Dir:" +f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified:"+d);
			long length = f.length();
			System.out.println("Length:" +length +"bytes");
			
		} else {
			System.out.println("file not found");
		}

	}

}
