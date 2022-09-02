package chapter05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		int lotto[] = new int[6];

		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			int c = random.nextInt(45) + 1;
			lotto[i] = c;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.println("로또 번호: " + lotto[i]);
		}
	}
}