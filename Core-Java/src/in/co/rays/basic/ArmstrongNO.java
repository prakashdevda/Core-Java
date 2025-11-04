package in.co.rays.basic;

public class ArmstrongNO {
	public static void main(String[] args) {
		int temp = 153;
		int num = temp;
		int rema = 0;
		int arms = 0;
		while (num > 0) {
			rema = num % 10;
			arms = arms + rema * rema * rema;
			num = num / 10;
		}
		if (temp == arms) {
			System.out.println("This is Armstrong No");
		} else {
			System.out.println("Not Armstrong No");
		}
	}

}
