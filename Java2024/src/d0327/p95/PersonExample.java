package d0327.p95;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "KyeBaek");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "USA";
//		p1.ssn = "1234";
		p1.name = "LeeSoonsin";
	}
}
