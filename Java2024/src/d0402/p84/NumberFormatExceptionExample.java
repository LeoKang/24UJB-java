package d0402.p84;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "1000";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);

		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}
