package in.co.rays.basic;

public class factorial {
	public static void main(String[] args) {
		int a = 5; // jis no.ka factorial chaiye
		int fact = 1;

		for (int i = 1; i <= a; i++) {
			fact = fact * i; // multiplay karte jao
		}

		System.out.println("Fact of " + a + " is: " + fact);
	}

}
