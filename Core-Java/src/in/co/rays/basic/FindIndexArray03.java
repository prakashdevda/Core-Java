package in.co.rays.basic;

public class FindIndexArray03 {
	public static void main(String[] args) {
		int[] a = { 24, 25, 48, 66, 44, 43, 76, 82 };
		int b = 48;
		int position = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				position = i;
				System.out.println(b + "=" + position);
			}
		}
		if (position == -1) {
			System.out.println(b + "=" + position);
		}
	}

}
