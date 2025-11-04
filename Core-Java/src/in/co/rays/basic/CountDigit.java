package in.co.rays.basic;

public class CountDigit {
	public static void main(String[] args) {
		String a = "vijay Dinanath Chouhan123456";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (Character.isDigit(a.charAt(i))) {
			count++;
			System.out.println(a.charAt(i));
			}
		}
		System.out.println(count);
	}

}
