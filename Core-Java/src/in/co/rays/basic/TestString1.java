package in.co.rays.basic;

public class TestString1 {
	public static void main(String[] args) {
		String name = "vijay Dinanath Chouhan";

		System.out.println("name:" + name);

		System.out.println("name lenght: " + name.length());

		System.out.println("7th char is: " + name.charAt(6));

		System.out.println("First index of a: " + name.indexOf('a'));

		System.out.println("Last index of a: " + name.lastIndexOf('a'));

		System.out.println("name replace: " + name.replace('a', 'b'));

		System.out.println("Name Lower: " + name.toLowerCase());

		System.out.println("Name Upper case: " + name.toUpperCase());

		System.out.println("Name Starts With: " + name.startsWith("vijay"));

		System.out.println("Name Starts With: " + name.endsWith("Chouhan"));

		System.out.println(name.substring(0, 15));

	} 

}
