package in.co.rays.basic;

public class PalindrameNo1 {
	public static void main(String[] args) {
		int temp = 232;
		int num = temp;
		int rema = 0;
		int reve = 0;
		while (num > 0) {
			rema = num % 10;
			reve = (reve * 10) + rema;
			num = num / 10;
		}
		System.out.println(reve);
		if (temp == reve) {
			System.out.println("Palindrom no");
		} else {
			System.out.println("No Palindrom no");
		}
	}

}
