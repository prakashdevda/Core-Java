package in.co.rays.basic;

public class StringClass5 {
	public static void main(String[]args) {
		String name = "Joseph Vijay Chandrasekhar";
		System.out.println(" name: " + name);
		System.out.println(" name: " + name.length());
		System.out.println(" name: " + name.charAt(15));
		System.out.println(" name: " + name.indexOf("s"));
		System.out.println(" name: " + name.lastIndexOf("s"));
		System.out.println(" name: " + name.replace("a","B"));
		System.out.println(" name: " + name.toLowerCase());
		System.out.println(" name: " + name.toUpperCase());
		System.out.println(" name: " + name.startsWith("Joseph"));
		System.out.println(" name: " + name.endsWith("sekhar"));
		System.out.println(" name: " + name.substring(13,20));
	}

}
