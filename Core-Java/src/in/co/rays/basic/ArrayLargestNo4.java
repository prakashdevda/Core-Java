package in.co.rays.basic;

public class ArrayLargestNo4 {
	public static void main(String[] args) {
		int[] n = {24,25,48,36,77,65,55,44,99};
		int largest = n[1];
		for(int i=0; i<n.length; i++) {
			if(n[i]>largest) {
				largest=n[i];
				
			}
		}
		System.out.println(largest);
		
	}

}
