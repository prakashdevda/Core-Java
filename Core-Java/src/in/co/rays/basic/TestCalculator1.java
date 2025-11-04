package in.co.rays.basic;

public class TestCalculator1 {
	public static void main(String[]args) {
		int a = 10;
		int b = 5;
		String opr = "-";
		switch (opr) {
		case"+":
			System.out.println("result:" + (a+b));
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
