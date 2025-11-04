package in.co.rays.basic;

public class PrimeNO17 {
	public static void main(String[]args) {
		int n=17;
		int count=0;
		for(int i=2; i<n; i++) {
			if(n%2==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("not prime");
		}else {
			System.out.println("prime no");
		}
	}

}
