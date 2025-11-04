package in.co.rays.basic;

public class SumNO101 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				System.out.println("sevan divided by:" + i);
				sum = sum + i;
			} else {
				System.out.println("sevan is not divided by: " + i);
			}
		}
		
		System.out.println(sum);
	}

}
