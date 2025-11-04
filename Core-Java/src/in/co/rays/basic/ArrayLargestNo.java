package in.co.rays.basic;

public class ArrayLargestNo {
	public static void main(String[] args) {
		int[] num = {24,56,34,64,45,78,55,42};
		int largest = num[0];
		for(int i=0; i<num.length; i++) {
		if(num[i]>largest) {
			largest=num[i];
		}
	}
		System.out.println(largest);

}
}