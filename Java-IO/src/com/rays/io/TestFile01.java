package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestFile01 {
	public static void main(String[] args) {
		File f = new File ("C:\\Devda01\\Devda Ji01.txt");
		if(f.exists()) {
			System.out.println("Found");
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			Date d = new Date(f.lastModified());
			System.out.println(d);
			long length = f.length();
			System.out.println(length);
		
		}else {
			System.out.println("Not Found");
		}
	}

}
