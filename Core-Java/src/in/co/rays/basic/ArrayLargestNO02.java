package in.co.rays.basic;

public class ArrayLargestNO02 {
	public static void main(String[] args) {
		int[] num = {15,23,564,48,26,75,69,89};
		int largest = num[1];
		for(int i=0; i<num.length; i++) {
			if (num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println(largest);
	}

}
