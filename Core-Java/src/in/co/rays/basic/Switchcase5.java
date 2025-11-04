package in.co.rays.basic;

public class Switchcase5 {
	public static void main(String[]args) {
		String day = "suterday";
		switch (day) {
		case "Monday":
			System.out.println("1st day of the week");
			break;
		case "Tuesday":
			System.out.println("2nd day of the week");
			break;
		case "Wednesday":
			System.out.println("3rd day of the week");
			break;
		case "Thursday":
			System.out.println("4th day of the week");
	        break;
		case "Friday":
			System.out.println("5th day of the week");
			break;
		case "suterday":
			System.out.println("6th day of the week");
			break;
			default:
			System.out.println("this day hollyday");
		}
	}

}
