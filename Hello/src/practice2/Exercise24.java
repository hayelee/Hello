package practice2;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double num1 = sc.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double num2 = sc.nextDouble();
		
		double result = num1*num1*Math.PI;
		System.out.println("원기둥 밑변의 넓이는: " + result);
		double result2 = result * num2;
		System.out.println("원기둥의 부피는: "+ result2);
	}
}
