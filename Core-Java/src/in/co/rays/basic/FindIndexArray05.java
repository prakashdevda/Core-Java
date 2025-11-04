package in.co.rays.basic;

public class FindIndexArray05 {
	public static void main(String[] args) {
		int[] num = {15,25,36,44,52,63,45,60};
		int n = 22;
		int position = -1;
		for(int i=0; i<num.length; i++) {
			if(num[i]== n) {
				position = i;
				System.out.println(n+"="+position);
			}
		}
		if(position==-1) {
			System.out.println(n + "=" + position);
		}
	}

}
