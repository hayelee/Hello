package chapter04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int n1 = scanner.nextInt();

		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int n2 = scanner.nextInt();

		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int n3 = scanner.nextInt();

		String result = "";
		int count = 0;
		// 초기화를 하고 실행하는 것이 좋다

		if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
			result = "삼각형을 만들 수 있습니다.";
		} else {
			result = "삼각형을 만들 수 없습니다.";

		}

		System.out.println(result);
	}

}