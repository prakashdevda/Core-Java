package in.co.rays.basic;

public class ElseIf2 {
	public static void main(String[] args) {
		int price = 100;
		if (price >= 110) {
			System.out.println("Big Pizza price");
		} else if (price >= 80) {
			System.out.println("Mediam Pizza Price");
		} else if (price >= 50) {
			System.out.println("Mini pizza Price");
		} else {
			System.out.println("No pizza");
		}
	}

}
