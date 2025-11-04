package in.co.rays.basic;

public class ArrayLargestNo01 {
	public static void main(String[] args) {
		int[] num = {12,24,25,35,99,48,88,66};
		int largest = num[0];
		for(int i=0; i<num.length; i++) {
			if ( num[i] > largest ) {
				largest = num[i];
			}
		}
		System.out.println(largest);
		
	}

}
