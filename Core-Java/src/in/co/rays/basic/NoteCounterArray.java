package in.co.rays.basic;

public class NoteCounterArray {
	public static void main(String[] args) {
		int[] notes = { 1000, 500, 200, 100 };
		int money = 51600;
		int count = 0;
		for(int note : notes) {
			count = money / note;
			money = money % note;
			System.out.println(note + "=" + count);

		}
	}

}
