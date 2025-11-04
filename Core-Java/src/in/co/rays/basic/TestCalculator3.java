package in.co.rays.basic;

public class TestCalculator3 {
	public static void main(String[]args) {
		int a = 30;
		int b = 10;
		String opr = "-";
		
		switch(opr) {
		case"+":
			System.out.println("result" + (a+b));
			break;
		case"-":
			System.out.println("result" + (a-b));
			break;
		case"*":
			System.out.println("result" + (a*b));
			break;
		case"/":
			System.out.println("result" + (a/b));
			break;
		case"%":
			System.out.println("result" + (a%b));
			break;
			default:
			break;
		}
	}
}
