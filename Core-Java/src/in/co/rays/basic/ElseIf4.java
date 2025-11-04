package in.co.rays.basic;

public class ElseIf4 {
	public static void main(String[]args) {
		int ticket = 500;
		if(ticket >= 3000) {
			System.out.println("First Claas Sit");
		}else if(ticket >= 2000){
			System.out.println("second Class Sit");
		}else if(ticket >= 1500) {
			System.out.println("Third Class Sit");
		}else if(ticket >= 1000) {
			System.out.println("Fourth Class sit");
		}else if(ticket >= 500) {
			System.out.println("Local Class sit");
		}else {
			System.out.println("No Sit");
		}
	}

}
