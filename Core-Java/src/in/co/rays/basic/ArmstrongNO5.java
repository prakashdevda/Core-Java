package in.co.rays.basic;

public class ArmstrongNO5 {
	public static void main(String[] args) {
		int temp = 370;
		int num = temp;
		int rema = 0;
		int arms = 0;
		while (num > 0) {
			rema = num % 10;
			arms = arms + rema * rema * rema;
			num = num / 10;

		}
		System.out.println(arms);
		if (temp == arms) {
			System.out.println("Armstrong");
		} else {
			System.out.println("NO Armstrong");
		}
	}

}
