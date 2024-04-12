import java.util.Scanner;

public class ButtonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int result = n3(n1, n2);
		System.out.println(result);
		sc.close();
	}

	public static int n3(int n1, int n2) {
		return (int) Math.pow(n1, n2);
	}
}