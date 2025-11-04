package in.co.rays.basic;

public class FibonacciNO3 {
	public static void main(String[]args) {
		int num = 7;
		int a = 0;
		int b = 1;
		int next = 0;
		for (int i=0; i<=num; i++) {
			next = a+b;
			a=b;
			b=next;
			System.out.println(next);
		}
	}

}
