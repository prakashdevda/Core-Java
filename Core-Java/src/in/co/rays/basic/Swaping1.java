package in.co.rays.basic;

public class Swaping1 {
	public static void main(String[]args) {
		int a = 5;
		int b = 10;
		int c = 0;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		c =a;
		a=b;
		b=c;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
