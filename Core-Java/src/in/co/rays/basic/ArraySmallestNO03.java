package in.co.rays.basic;

public class ArraySmallestNO03 {
	public static void main(String[] args) {
		int[] n = {22,33,44,55,66,77,88};
		int smallest = n[1];
		for(int i=0; i<n.length; i++) {
			if(n[i]<smallest) {
				smallest=n[i];
			}
		}
		System.out.println(smallest);
	}

}
