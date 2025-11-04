package in.co.rays.basic;

public class PalindromeNO4 {
	public static void main(String[] args) {
		int temp = 121;
		int numb = temp;
		int rema = 0;
		int reverse = 0;
		while (numb > 0) {
			rema = numb % 10;
			reverse = (reverse * 10) + rema;
			numb = numb / 10;
		}
		System.out.println(reverse);
		if (temp == reverse) {
			System.out.println("Palindrome no");
		} else {
			System.out.println("NO Palindrome no");
		}
	}

}
