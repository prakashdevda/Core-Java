package in.co.rays.basic;

public class PalindrameNO2 {
	public static void main(String[] args) {
		int temp = 131;
		int no = temp;
		int r = 0;
		int reverseNo = 0;
		while (no > 0) {
			r = no % 10;
			reverseNo = (reverseNo * 10) + r;
			no = no / 10;
		}
		System.out.println(reverseNo);
		if (temp == reverseNo) {
			System.out.println("Palindrame no");
		} else {
			System.out.println("No Palindrame no ");
		}
	}

}
