package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		double width;
		double height;
		double area;
		double perimeter;

		Scanner scanner = new Scanner(System.in);

		// 컴퓨터: 데이터 입력 -> 처리-> 출력
		// 입력
		System.out.print("가로의 길이는?(단위:m): ");
		double num1 = scanner.nextDouble();

		System.out.print("세로의 길이는?(단위:m): ");
		double num2 = scanner.nextDouble();

		// 처리

		double result = num1 * num2;
		double result1 = (num1 + num2) * 2;

		// 출력
		System.out.println("직사각형의 넓이: " + result);
		System.out.println("직사각형의 둘레: " + result1);
	}
}