package in.co.rays.basic;

public class CountDigits03 {
	public static void main(String[]args) {
		String num = "Vijay45661223 Dinanath123 Chouhan4566";
		
		int count = 0;
		for(int i=0; i<num.length(); i++) {
			if(Character.isDigit(num.charAt(i))) {
				count++;
			
			}
		}
		System.out.println(count);
	}

}
 