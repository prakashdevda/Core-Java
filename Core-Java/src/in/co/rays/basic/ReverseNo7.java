package in.co.rays.basic;

public class ReverseNo7 { 
	public static void main(String[]args) {
		int no = 234;
		int rema = 0;
		int reverse = 0;
		while (no>0) {
			rema = no%10;
			reverse = (reverse*10)+rema;
			no = no /10;
		}
		System.out.println(reverse);
	}

}
