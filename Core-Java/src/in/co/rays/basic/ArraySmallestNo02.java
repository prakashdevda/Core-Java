package in.co.rays.basic;

public class ArraySmallestNo02 {
	public static void main(String[] args) {
		int[] num = {45,36,42,66,48,98,75};
		int smallest = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println(smallest);
	}

}
