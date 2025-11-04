package in.co.rays.basic;

public class FindIndexArray02 {
	public static void main(String[] args) {
		int[] numbers = { 24, 25, 36, 45, 68, 49, 74, 56 };
		int b = 68;
		int position = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == b) {
				position = i;
				System.out.println(position);
			}
		}
		    if (position == -1) {
			System.out.println(position);
		}

	}

}
