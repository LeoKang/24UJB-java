import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		for (int i = 0; i < str.length(); i++) {
			char anw = str.charAt(str.length() - 1);
			String name = anw + str.substring(0, str.length() - 1);
			str = name;
			System.out.println(name);
		}
	}
}