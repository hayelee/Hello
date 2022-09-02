package chapter02;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("500원짜리 동전의 갯수: ");
		int num1 = (int) scanner.nextDouble();
		System.out.print("100원짜리 동전의 갯수: ");
		int num2 = (int) scanner.nextDouble();
		System.out.print("50원짜리 동전의 갯수: ");
		int num3 = (int) scanner.nextDouble();
		System.out.print("10원짜리 동전의 갯수: ");
		int num4 = (int) scanner.nextDouble();

		int result = num1 * 500 + num2 * 100 + num3 * 50 + num4 * 10;
		System.out.printf("저금통 안의 동전의 총 액수: %,d", result);
	}
}