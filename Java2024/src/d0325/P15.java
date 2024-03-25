package d0325;

public class P15 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100000; i++) {
			sum += i;
			System.out.println("sum = " + sum);
		}

		System.out.println("sum = " + sum);
	}
}
