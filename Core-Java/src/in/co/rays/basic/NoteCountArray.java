package in.co.rays.basic;

public class NoteCountArray {
	public static void main(String[] args) {
		int[] notes = {2000,1000,500,200,100,50,20,10};
		int money =8830;
		int count = 0;
		for(int note : notes) {
			count = money/ note;
			money = money% note;
			System.out.println(note+ "="+count);
		}
	}

}
