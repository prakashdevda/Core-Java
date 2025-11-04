package in.co.rays.basic;

import java.util.Random;

public class RandomNo2 {
	public static void main(String[]args) {
		Random r = new Random();
		for(int i=0; i<=10; i++) {
			int n = r.nextInt(1000);
			System.out.println(n);
		}
	}

}
 