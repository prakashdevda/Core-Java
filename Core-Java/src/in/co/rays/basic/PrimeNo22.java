package in.co.rays.basic;

public class PrimeNo22 {
	public static void main(String[] args) {
		int n = 22;
		int count = 0;
		for (int i = 2; i < n; i++) {
		 if (n % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("this no is not Prime no");
		} else {
			System.out.println("this no is Prime no");
		}
	}
}
