package in.co.rays.basic;

public class PrimeNo39 {
	public static void main(String[]args) {
		int n = 39;
		int count = 0;
		for(int i = 2; i<n; i++) {
			if(n%2==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("this is not prime no");
		}else {
			System.out.println("this is prime no");
		}
	}

}
