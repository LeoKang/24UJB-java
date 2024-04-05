import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// System.out.println(num); ? 캐너 출력 ? ? ? .

		for (int i = 1; i <= n * n; i++) {
			System.out.print(i + " ");
			// int tap = n*n;
			// for(int j = n*i; j < i*n; j++)
			if (i % n < 1) {
				System.out.println();
			}
		}
	}
}