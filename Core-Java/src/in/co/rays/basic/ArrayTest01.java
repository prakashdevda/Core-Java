package in.co.rays.basic;

public class ArrayTest01 {
	public static void main(String[]args) {
		int[] a = {11,12,13,14,15,16,17,18,19,20};
		System.out.println( a[0]+ "," + a[1] + "," + a[2] );
		System.out.println( a[0] + a[1] + a[2] );
		System.out.println(a.length);
		for(int i=0; i<a.length; i++ ) {
			System.out.println(i + "=" + a[i]);
		}
	}

}
