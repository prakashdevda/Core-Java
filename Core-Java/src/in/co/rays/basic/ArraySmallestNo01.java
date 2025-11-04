package in.co.rays.basic;

public class ArraySmallestNo01 {
	public static void main(String[] args) {
		int[] num = {14,25,36,45,12,46,48,50};
		int smallest = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i] < smallest) {
				smallest = num[i];
				System.out.println(smallest);
			}
		}
	
	}

}
