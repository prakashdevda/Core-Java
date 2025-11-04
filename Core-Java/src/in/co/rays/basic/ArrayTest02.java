package in.co.rays.basic;

public class ArrayTest02{
	public static void main(String[]args) {
		int[] a = { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
		int num = 27;
		for (int i = 0; i < a.length; i++) {
			    System.out.println(a[i]);
			if (num == a[i]) {
				System.out.println(num + "=" + i);

			}
			
		}

	}

}
