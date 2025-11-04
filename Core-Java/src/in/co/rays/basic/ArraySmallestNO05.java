package in.co.rays.basic;

public class ArraySmallestNO05 {
	public static void main(String[] args) {
		int[] num = {45,26,35,56,48,68,49,88,75,95};
		int smallest = num[1];
		for(int i=0; i<num.length; i++) {
			if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println(smallest);
	}

}
