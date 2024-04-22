import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		bfs(arr, num);
	}

	public static void bfs(int[] arr, int num) {
		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < num) {
				queue.offer(arr[i]);
			}
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
	}
}
