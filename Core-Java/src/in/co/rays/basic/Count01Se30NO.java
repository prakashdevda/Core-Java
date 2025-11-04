package in.co.rays.basic;

public class Count01Se30NO {
	public static void main(String[] args) {
		int[] n = {01,00,10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b < n.length; b++) {
				System.out.print(n[b] + a+"\t" );
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");

		}
	}

}

