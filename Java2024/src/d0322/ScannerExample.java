package d0322;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		scanner.close();
		
		System.out.println(str);
		
//		System.out.print("x �� �Է�:");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//
//		System.out.print("y �� �Է�:");
//		String strY = scanner.next();
//		int y = Integer.parseInt(strY);
//
//		int result = x + y;
//		System.out.println("x + y: " + result);
//		System.out.println();
//		
//		while (true) {
//			System.out.print("�Է� ���ڿ�: ");
//			String data = scanner.nextLine();
//			if (data.equals("q")) {
//				break;
//			}
//			System.out.println("��� ���ڿ�: " + data);
//			System.out.println();
//		}
		scanner.close();
	}
}