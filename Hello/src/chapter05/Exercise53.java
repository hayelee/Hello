package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요: ");
		while (true) {
			Random random = new Random();
			int c = random.nextInt(3); // 0부터 2까지의 랜덤한 수

			String result = "";
			String gamer = scanner.next();
			String[] str = { "가위", "바위", "보" };
			String computer = str[c];

			if (gamer.equals(computer)) {
				result = "비겼습니다.";
			} else if (gamer.equals("가위") && computer.equals("보") || gamer.equals("바위") && computer.equals("가위")
					|| gamer.equals("보") && computer.equals("바위")) {
				result = "게이머 승리!";
			} else {
				result = "인공지능 컴퓨터 승리!";
			}
			System.out.println("게이머: " + gamer);
			System.out.println("인공지능 컴퓨터: " + str[c]);
			System.out.println("결과: " + result);

		}
	}
}