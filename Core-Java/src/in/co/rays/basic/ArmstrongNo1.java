package in.co.rays.basic;

public class ArmstrongNo1 {
	public static void main(String[] args) {
		int temp = 152;
		int n = temp;
		int r = 0; 
		int armstringNo = 0;

		while (n > 0) {
			r = n % 10;
			armstringNo = armstringNo + r * r * r;
			n = n / 10;
		}
		System.out.println(armstringNo);
		if (temp == armstringNo) {
			System.out.println("armstrong no");
		} else {
			System.out.println("not armstrong no");
		}
	}

}
