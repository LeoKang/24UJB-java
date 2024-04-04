package d0404.p38;

public class Main {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = "  4567  ";
		String tel4 = "  4 5 6   7  ";

		System.out.println(tel1);
		System.out.println(tel2);
		System.out.println(tel3);
		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		System.out.println("[" + tel3 + "]");
		System.out.println("[" + tel3.trim() + "]");
		System.out.println("[" + tel4 + "]");
		System.out.println("[" + tel4.trim() + "]");
	}
}
