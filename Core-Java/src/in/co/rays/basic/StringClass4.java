package in.co.rays.basic;

public class StringClass4 {
	public static void main(String[]args) {
		
		String name = "Vijay dinanath chouhan";
		
		System.out.println(" Name                = : " + name );
		
		System.out.println(" Name Length         = : " + name.length());
		
		System.out.println(" Name 7th char is    = : " + name.charAt(8));
		
		System.out.println(" Name First index of = : " + name.indexOf('a'));
		
		System.out.println(" Name Last index of  = : " + name.lastIndexOf('a'));
		
		System.out.println(" Name Replace to     = : " + name.replace('a','b')); 
		
		System.out.println(" Name to Lower case  = : " + name.toUpperCase());
		
		System.out.println(" Name Starts With    = : " + name.toLowerCase());
		
		System.out.println(" Name to Upper case  = : " + name.startsWith("Vijay"));
		
		System.out.println(" Name End with       = : " + name.endsWith("chouhan"));
		
		System.out.println(" Name String no      = : " + name.substring(0,15));
	}
}

