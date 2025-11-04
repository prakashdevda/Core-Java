package in.co.rays.basic;

public class String12 {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if ('n' == name.charAt(i)) {
				count++;
			}

		}
		System.out.println(count);
	}

}
