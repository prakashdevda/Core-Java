package in.co.rays.basic;

public class ArrayLargestNO03 {
	
	public static void main(String[] args) {
		int[] n = {14,16,18,45,20,22,24};
		int largest =n[1];
		for (int i=0; i<n.length; i++) {
			if (n[i]>largest) {
				largest=n[i];
				
			}
		}
		System.out.println(largest);
	}

}
