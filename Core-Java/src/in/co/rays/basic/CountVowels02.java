package in.co.rays.basic;

public class CountVowels02 {
	public static void main(String[] args) {
		String num = "Vijay Dinanath Chouhan";

		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			if ('a' == num.charAt(i) || 'e' == num.charAt(i) || 'i' == num.charAt(i) || 'o' == num.charAt(i)
					|| 'u' == num.charAt(i)) {
				count++;
				System.out.println(count);
			}
		}
	
	}
}
