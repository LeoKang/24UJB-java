import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int last = 0;
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String input = sc.next();

			switch (input) {
			case "push":
				last = sc.nextInt();
				queue.offer(last);
				break;

			case "pop":
				sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
				break;

			case "size":
				sb.append(queue.size()).append("\n");
				break;

			case "front":
				sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
				break;

			case "empty":
				sb.append(queue.isEmpty() ? 1 : 0).append("\n");
				break;

			case "back":
				sb.append(queue.isEmpty() ? -1 : last).append("\n");
				break;
			}

		}
		sc.close();
		System.out.println(sb);
	}
}
