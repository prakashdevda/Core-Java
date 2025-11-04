package in.co.rays.basic;

public class FirstLargestNoArray {
	public static void main(String[] args) {
		int[] a = { 15, 24, 18, 36, 45, 55, 77, 99 };
		int largest = a[0];
		for (int b : a) {
			if (b > largest) {
				largest = b;
			}
		}
		System.out.println(largest);
		int seclargest = a[0];
		for (int b : a) {
			if (b < largest && b > seclargest) {
				seclargest = b;
			}
		}
		System.out.println(seclargest);
	}

}
