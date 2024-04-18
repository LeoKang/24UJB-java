import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double avg;
		int cnt = 0;
		for (;;) {
			int A = sc.nextInt();
			if (0 <= A && A <= 100) {
				sum += A;
				cnt++;
			} else {
//				sc.close();
				avg = (sum / cnt);
				System.out.println("sum : " + (int) sum);
				System.out.print("avg : ");
				System.out.printf("%.1f", avg);
			}
		}
	}
}