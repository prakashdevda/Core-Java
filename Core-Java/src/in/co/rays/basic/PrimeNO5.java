package in.co.rays.basic;

public class PrimeNO5 {
	public static void main(String[]args) {
		int n = 5;
		int count = 0;
		for(int i =2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("This is not Prime no");
		}else {
			System.out.println("This is Prime no");
		}
	}

}
