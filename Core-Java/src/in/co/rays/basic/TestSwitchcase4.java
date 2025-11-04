package in.co.rays.basic;

public class TestSwitchcase4 {
	public static void main(String[]args) {
		String day = "Sunday";
		switch (day) {
		case "Monday":
			System.out.println("1st day of the Week");
			break;
		case "Tuesday":
			System.out.println("2nd day of the Week");
			break;
		case "Wednesday":
			System.out.println("3rd day of the Week");
			break;
		case "Thursday":
			System.out.println("4th day of the Week");
			break;
		case "Friday":
			System.out.println("5th day of the Week");
			break;
		case "Suterday":
			System.out.println("6th day of the Week");
			break;
			default:
			System.out.println("This day hollyday");
			break;
		}
	}

}
