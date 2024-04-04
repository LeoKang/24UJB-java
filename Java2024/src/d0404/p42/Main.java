package d0404.p42;

public class Main {
	public static void main(String[] args) {
		String text = "È«±æµ¿&ÀÌ¼öÈ«,¹Ú¿¬¼ö,±èÀÚ¹Ù-Simon";

		String[] names = text.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
