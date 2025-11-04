package in.co.rays.basic;

public class ArrayString01 {
	public static void main(String[] args) {
		String[] name = { "Ram", "Rahul", "Sumit", "Deepak", "Dinesh" };
		System.out.println(name[0] + "," + name[2] + "," + name[4]);
		System.out.println(name[1] + name[4]);
		for(int i=0; i<name.length;i++) {
			
			System.out.println(i + "=" +name[0]+name[i]);
			System.out.println("------------------");
		}
	}
}
