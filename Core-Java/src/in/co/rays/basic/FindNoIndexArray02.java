package in.co.rays.basic;

public class FindNoIndexArray02 {
	public static void main(String[] args) {

		int[] n = { 20, 25, 45, 55, 33, 44, 77 };
		int a = 25;
		int position = -1;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == a) {
				position = i;
				System.out.println(a + " = " + position);
			}
		}
		if (position == -1) {
			System.out.println(a + "=" + position);
		}
	}

}
