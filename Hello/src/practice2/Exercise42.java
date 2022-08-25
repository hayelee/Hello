package practice2;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		int n1 = sc.nextInt();
	
		String season ="";
		
		switch(n1) {
		
		case 3: case 4: case 5:
			season = n1 + "월은 봄입니다.";
			break;
		case 6: case 7: case 8:
			season = n1 + "월은 여름입니다.";
			break;
		case 9: case 10: case 11:
			season = n1 + "월은 가을입니다.";
			break;
		case 12: case 1: case 2:
			season = n1 + "월은 겨울입니다.";
			break;
		default : 
			season = n1 + "월은 잘못된 입력입니다.";
		}
		System.out.println(season);
	}
}
