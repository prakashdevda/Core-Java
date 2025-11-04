package in.co.rays.basic;

public class ReverseNo3 {
	public static void main(String[] args) {
		int n = 56789;
		int r = 0;
		int reverseNo = 0;
		while (n > 0) {
			r = n % 10;
			reverseNo = (reverseNo * 10) + r;
			n = n / 10;

		}
		System.out.println(reverseNo);
	}

}
