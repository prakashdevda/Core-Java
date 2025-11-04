package in.co.rays.basic;

public class ElseIf3 {
	public static void main(String[]args) {
		int price = 50;
		if(price >= 150) {
			System.out.println("Buy the 5 Books");
		}else if(price >= 100) {
			System.out.println("Buy the 3 Books");
		}else if(price >= 50) {
			System.out.println("Buy the 2 Books");
		}else if(price >= 25) {
			System.out.println("Buy the 1 Book");
		}else {
			System.out.println("No Buy Book");
		}
	}

}
