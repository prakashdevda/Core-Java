package in.co.rays.basic;

public class TestArray01 {
	public static void main(String[] args) {
		int[] n = { 14, 25, 36, 45, 15, 16 };
		System.out.println(n[0] + "," + n[1]);
		System.out.println(n[0] + n[1]);

		System.out.println(n.length);

		System.out.println("--------");

		for (int i = 0; i < n.length; i++) {
			System.out.println(i + " = " + n[i]);
		}

		System.out.println("---------");
		
		for(int c : n) {
			System.out.println(c);
		}
	}

}
