package d0325;

public class P48 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("sum : " + sum);
	}
}
