package d0409.p61;

import java.util.Iterator;
import java.util.TreeSet;

public class ComporableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));

		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
//			System.out.println(person.name + " : " + person.age);
			System.out.println(person.getName() + " : " + person.getAge());
		}
	}
}
