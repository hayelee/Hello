package practice2;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int first = sc.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int second = sc.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int third = sc.nextInt();
		
		int count = 0;
		
		if (second + third > first && third + first > second && first + second > third) {
			System.out.println("삼각형을 만들 수 있습니다.");
		
		}else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}
}
