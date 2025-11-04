package in.co.rays.basic;

public class ArmstrongNo2 {
	public static void main(String[] args) {
		int temp = 153;
		int no = temp;
		int reme = 0;
		int arms = 0;
		while (no > 0) {
			reme = no % 10;
			arms = arms + reme * reme * reme;
			no = no / 10;
		}
		System.out.println(arms);
		if (temp == arms) {
			System.out.println("Armstrong no");
		} else {
			System.out.println("NO Armstrong no");
		}
	}

}
