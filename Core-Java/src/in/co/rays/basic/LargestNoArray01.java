package in.co.rays.basic;

public class LargestNoArray01 {

	public static void main(String[] args) {
		int[] number = { 12, 25, 45, 36, 78, 98, 65, 24 };
		int largest = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number[i];
			
			}
		}
		System.out.println(largest);

	}
}
