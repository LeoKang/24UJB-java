package d0325;

public class P18 {
	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8 };

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scores[i];
		}
//		for(int s : scores) {
//			sum += s;
//		}			

		System.out.println("sum = " + sum);

	}

}
