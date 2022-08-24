package practice2;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int year = sc.nextInt();
		
		String yyear = ((year%4==0) && (year%400==0) || (year%100!=0) ? "맞습니다." : "아닙니다.");
		
		System.out.println(year + "년은 윤년이"+ yyear);
	}
}
