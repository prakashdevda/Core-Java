package in.co.rays.basic;

public class FirstSecLargestArray02 {
	public static void main(String[] args) {
		int[] n = {42,23,45,66,78,99,12,15};
		int largest =n[0];
		for(int b:n) {
			if(b>largest) {
				largest=b;
			}
		}
		System.out.println(largest);
		int seclargest =n[0];
		for(int b:n) {
			if(b<largest&&b>seclargest) {
				seclargest=b;
			}
		}
		System.out.println(seclargest);
	}

}
