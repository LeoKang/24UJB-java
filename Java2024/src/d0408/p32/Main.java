package d0408.p32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long timeStart, timeEnd;
		long repeatCnt = 10000;

		timeStart = System.nanoTime();
		for (int i = 0; i < repeatCnt; i++) {
			list1.add(i, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		long time = timeEnd - timeStart;
		System.out.print("ArrayList  걸린 시간 : ");
		System.out.printf("%10d ns\n", time);

		timeStart = System.nanoTime();
		for (int i = 0; i < repeatCnt; i++) {
			list2.add(i, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		time = timeEnd - timeStart;
		System.out.print("LinkedList 걸린 시간 : ");
		System.out.printf("%10d ns\n", time);
	}

}
