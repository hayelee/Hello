package practice2;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int big = ((num1+num2)+Math.abs(num1-num2))/2;
		int small = ((num1+num2)-Math.abs(num1-num2))/2;
		
		int result = big/small;
		int result2 = big%small;
		System.out.println("큰 수를 작은 수로 나눈 몫은 " + result + "이고, " + "나머지는 " + result2 +" 이다.");
	}
}
