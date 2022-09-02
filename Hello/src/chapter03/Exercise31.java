package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int n1 = scanner.nextInt();

		System.out.print("두 번째 숫자를 입력하세요: ");
		int n2 = scanner.nextInt();

		int Big = ((n1 + n2) + Math.abs(n1 - n2)) / 2;
		int Small = ((n1 + n2) - Math.abs(n1 - n2)) / 2;

		int num1 = Big / Small;
		int num2 = Big % Small;

		System.out.println("큰 수를 작은 수로 나눈 몫은 " + num1 + "이고, 나머지는 " + num2 + "이다.");

	}
}