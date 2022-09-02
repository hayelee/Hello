package chapter04;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		int n1 = scanner.nextInt();
		String season = "";
		switch (n1) {
		case 3:
		case 4:
		case 5:
			season = (n1 + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			season = (n1 + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			season = (n1 + "월은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			season = (n1 + "월은 겨울입니다.");
			break;
		default:
			season = (n1 + "월은 잘못된 입력입니다.");
			break;
		}
		System.out.println(season);
	}
}
// if문 사용

// if (month >= 3 && month <=5) {
// season = "봄";
// } else if (month >= 6 && month <=8){
// season = "여름";
// } else if (month >= 9 && month <=11){
// season = "가을";
// } else if (month == 12 || month <=2){
// season = "겨울";
// } else {
// season = "알 수 없는 계절";