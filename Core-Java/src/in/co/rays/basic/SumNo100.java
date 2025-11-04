package in.co.rays.basic;

public class SumNo100 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				System.out.println("divided by seven: " + i);
				sum = sum + i;
			}

		}
		
		System.out.println(sum);
	}

}
