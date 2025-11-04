package in.co.rays.basic;

public class PalindramNo {
	public static void main(String[] args) {
		int temp =212;
		int num = temp;
		int rema = 0; 
		int reve = 0;
		while(num>0) {
			rema = num%10;
			reve = (reve*10)+rema;
			num = num/10;
			
		}
		System.out.println(reve);
		if (temp == reve) {
			System.out.println("THiS is Palindram no");
		}else {
			System.out.println("NO Pal9ndram no");
		}
	}

}
