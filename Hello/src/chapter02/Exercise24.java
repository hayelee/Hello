package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm): ");
		double num1 = scanner.nextDouble();

		System.out.print("원기둥의 높이를 입력하시오.(단위:cm): ");
		double num2 = scanner.nextDouble();

		double result = num1 * num1 * Math.PI;
		System.out.println("원기둥 밑변의 넓이는: " + result + "㎠" + "이고, ");
		double result1 = result * num2;
		System.out.println("원기둥의 부피는: " + result1 + "㎠" + "이다.");
	}
}