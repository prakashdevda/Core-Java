package in.co.rays.basic;

public class FIndNoInArray01 {
	public static void main(String[] args) {
		int[] n = { 5, 15, 20, 25, 30, 15, 35, 50 };

		int a = 20;

		int position = -1;

		for (int i = 0; i < n.length; i++) {
			if (n[i] == a) {
				position = i;
				System.out.println(a + "=" + position);
			}
		}
		if (position == -1) {
			System.out.println(a + "=" + position);
		}
	}

}
