package in.co.rays.basic;

public class CountVowels {
	public static void main(String[] args) {
		String n = "Vijay dinanath Chouhan";
		
		int count = 0;
		for(int i = 0; i<n.length(); i++ ) {
			 if('a'==n.charAt(i)|| 'e'==n.charAt(i)|| 'i'==n.charAt(i)|| 'o'==n.charAt(i)||'u'==n.charAt(i)) {
				 count++;
				 System.out.println(count);
			 }
		}
		System.out.println(count);
	}

}
 