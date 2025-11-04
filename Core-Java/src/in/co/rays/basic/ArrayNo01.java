package in.co.rays.basic;

public class ArrayNo01 {
	public static void main(String[] args) {
		int[] n = { 10, 12, 14, 16, 18, 20 };
		System.out.println(n.length);
		System.out.println(n[1] + "," + n[3] + "," + n[5]);
		System.out.println(n[1] + n[2] + n[3] + n[5]);
		for (int i = 0; i < n.length; i++) {
			System.out.println(i + "=" + n[i]);
		}
	}
}
