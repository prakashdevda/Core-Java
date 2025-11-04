package in.co.rays.basic;

public class FindIndexArray01 {
	public static void main(String[] args) {
		int[] number = {25,35,64,58,69,47,65,45,12};
		int b = 47;
		int position = -1;
		for(int i=0; i<number.length; i++) {
			if (number[i]==b) {
				position=i;
				System.out.println(b + "=" + position);
			}
		}
		if(position == -1) {
			System.out.println(position);
		}
	}

}
