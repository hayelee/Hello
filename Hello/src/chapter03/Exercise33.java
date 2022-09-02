package chapter03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int y1 = scanner.nextInt();

		String year = ((y1 % 4 == 0) && (y1 % 400 == 0)) || (y1 % 100 != 0) ? "입니다." : "이 아닙니다.";

		System.out.println(y1 + "은 윤년" + year);

	}
}