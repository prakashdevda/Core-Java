package in.co.rays.basic;

public class FirstSecdLargestNo01 {
	public static void main(String[] args) {
		int[] num = {15,55,68,48,22,32,45,94,78};
		int largest = num[0];
		for(int number:num) {
			if (number>largest) {
				largest=number;
			}
		}
		System.out.println(largest);
		int seclargest =num[0];
		for(int number:num) {
			if (number < largest && number > seclargest ) {
				seclargest=number;
			
			}
		}
		System.out.println(seclargest);
	}

}
