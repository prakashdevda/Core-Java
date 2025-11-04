package in.co.rays.basic;

public class SwitchCalculator01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String opr = "/";
		switch(opr) {
		case"+":
			System.out.println("Result" + (a+b));
			break;
		case"-":
			System.out.println("Result" + (a-b));
			break;
		case"*":
			System.out.println("Result" + (a*b));
			break;
		case"%":
			System.out.println("Result" + (a%b));
			break;
		case"/":
			System.out.println("Result" + (b/a));
			break;
		}
	}

} 
  