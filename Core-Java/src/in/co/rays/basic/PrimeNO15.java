package in.co.rays.basic;

public class PrimeNO15 {
	public static void main(String[]args) {
		int n=15;
		int count=0;
		for(int i=2; i>n; i++) {
			if(n%i==0) {
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
