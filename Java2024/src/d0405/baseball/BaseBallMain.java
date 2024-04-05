package d0405.baseball;

import java.util.Random;
import java.util.Scanner;

public class BaseBallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] rnd = new int[3];

		boolean bEq = false;
		do {
			bEq = false;
			for (int i = 0; i < rnd.length; i++) {
				rnd[i] = random.nextInt(9) + 1;
			}
			if (rnd[0] == rnd[1] || rnd[1] == rnd[2] || rnd[2] == rnd[0]) {
				bEq = true;
			}
		} while (bEq);

		// print
		for (int i = 0; i < rnd.length; i++) {
			System.out.print(rnd[i] + " ");
		}
		System.out.println();

		int[] inp = new int[3];
		boolean bGO = false;
		int stk = 0, ball = 0;
		do {
			stk = 0;
			ball = 0;
			bGO = true;
			System.out.print("Input number... ");
			for (int i = 0; i < inp.length; i++) {
				inp[i] = sc.nextInt();
			}

			// print
			for (int i = 0; i < inp.length; i++) {
				System.out.print(inp[i] + " ");
			}

			// calc strike
			for (int i = 0; i < rnd.length; i++) {
				if (rnd[i] == inp[i]) {
					stk++;
				}
			}

			// calc ball
			for (int i = 0; i < rnd.length; i++) {
				for (int j = 0; j < rnd.length; j++) {
					if (i != j && rnd[i] == inp[j]) {
						ball++;
					}
				}
			}
			
			System.out.println("strike : " + stk + ", ball : " + ball);
			
			if(stk == 3) {
				bGO = false;
			}
		} while (bGO);
		System.out.println("축하합니다.*^^*\n");
	}
}
