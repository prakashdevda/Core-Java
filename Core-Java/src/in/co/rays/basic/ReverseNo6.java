package in.co.rays.basic;

public class ReverseNo6 {
	public static void main(String[]args) {
		int no = 4321;
		int ran = 0;
		int rese = 0;
		while(no>0) {
			ran = no%10;
			rese =(rese*10)+ran;
			no = no/10;
		}
		System.out.println(rese);
	
	}

}
