package in.co.rays.basic;

public class CharLength1 {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan1234567812";
	System.out.println( name.length());
	System.out.println(name.charAt(16));
	System.out.println(name.indexOf('n'));
	System.out.println(name.lastIndexOf('h'));
	System.out.println(name.replace('a','h'));
	System.out.println(name.replace('n','j'));
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.startsWith("Vijay"));
	System.out.println(name.endsWith("Chouhan"));
	System.out.println(name.substring(1,2));
	
	}

}
