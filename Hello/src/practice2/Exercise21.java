package practice2;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		double width;
		double height;
		double area;
		double perimeter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m): ");
		double num1 = sc.nextDouble();
		System.out.print("세로의 길이는?(단위: m): ");
		double num2 = sc.nextDouble();
		System.out.println("직사각형의 넓이: " + num1 * num2 );
		System.out.println("직사각형의 둘레: "+ (num1 + num2)*2);
	}
}
