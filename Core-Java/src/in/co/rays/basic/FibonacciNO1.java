package in.co.rays.basic;

public class FibonacciNO1 {
	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;
		int next = 0;
		for (int i = 1; i <= 10; i++) {
			next = a + b;
			a = b;
			b = next;
			System.out.println(next);
		}
	}
}
 
