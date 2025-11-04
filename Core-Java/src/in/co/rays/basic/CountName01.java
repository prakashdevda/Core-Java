package in.co.rays.basic;

public class CountName01 {
	public static void main(String[] args) {
		String name = "Prakash Devda";

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if ('a' == name.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
