package in.co.rays.basic;

import java.util.Random;

public class RandomNumber3 {
	public static void main(String[]args) {
		Random r = new Random();
		for (int i = 1; i <= 8; i++) {
			int n = r.nextInt(50);
			System.out.println(n);
		}
	}
	

}
