package in.co.rays.basic;

public class FindIndexArray04 {
	public static void main(String[] args) {
		int[] n = { 24, 25, 26, 75, 28, 29, 35, 45, 56 };
		int b = 75;
		int position = -1;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == b) {
				position = i;
				System.out.println(b + "=" + position);
			}
		}
		if (position == -1) {
			System.out.println(b + "=" + position);
		}
	}
}
