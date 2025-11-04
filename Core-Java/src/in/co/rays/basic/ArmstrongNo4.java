package in.co.rays.basic;

public class ArmstrongNo4 {
	public static void main(String[]args) {
		int temp = 370;
		int numb = temp;
		int rema = 0;
		int arms = 0;
		while (numb > 0) {
			rema = numb % 10;
			arms = arms + rema * rema * rema;
			numb = numb / 10;
		}
		System.out.println(arms);
		if(temp==arms) {
			System.out.println("Armstrong");
		}else {
			System.out.println("NOT Armstrong");
		}
	}
 
}
