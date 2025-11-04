package in.co.rays.basic;

public class CountDigits02 {
	public static void main(String[]args) {
		String num = "Vijay256 Dinanath4746 Chouhan325";
		
		int count = 0;
		for(int i=0; i<num.length(); i++) {
			if (Character.isDigit(num.charAt(i))) {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
