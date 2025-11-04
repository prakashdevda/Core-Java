package in.co.rays.basic;

public class PalindromeNo {
	public static void main(String[] args) {
		int temp = 151;
		int no = temp;
		int rema = 0;
		int reve = 0;
		while (no > 0) {
			rema = no % 10;
			reve = (reve * 10) + rema;
			no = no / 10;
		}
		System.out.println(reve);
		if (temp == reve) {
			System.out.println("palindrome no");
		} else {
			System.out.println("No Palindrome");
		}
	}
}
