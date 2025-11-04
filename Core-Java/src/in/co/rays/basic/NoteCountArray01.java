package in.co.rays.basic;

public class NoteCountArray01 {
	public static void main(String[] args) {
		int[] notes = { 2000, 1000, 500, 200, 100, 50 };
		int money = 77850;
		int count = 0;
		for (int note : notes) {

			count = money / note;
			money = money % note;
			System.out.println(note + "=" + count);
		}

	}
}
