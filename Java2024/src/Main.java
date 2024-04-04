import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int S = (M + T);
		sc.close();

		for (;;) {
			if (S >= 60) {
				H += 1;
				S -= 60;
				if (H >= 24) {
					H -= 24;
				}

				// System.out.print(H + " ");
				// System.out.println(S);
				if (S <= 60) {
					System.out.print(H + " ");
					System.out.println(S);
				}
			}else {
				break;
			}
		}
	}
}