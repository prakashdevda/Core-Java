package in.co.rays.basic;

public class ArrayTestNo {
	public static void main(String[] args) {
		int[] n = {22,33,44,55,66,77,88,99};
		System.out.println(n[0]+","+n[5]+","+n[3]);
		System.out.println(n[0]+n[1]+n[2]+n[3]+n[4]);
		for(int i =0; i<n.length; i++) {
			System.out.println(i+ "=" + n[i]);
		}
	}

}
