package practice2;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int num1 = sc.nextInt();
		System.out.print("데이터베이스: ");
		int num2 = sc.nextInt();
		System.out.print("화면구현: ");
		int num3 = sc.nextInt();
		System.out.print("애플리케이션 구현: ");
		int num4 = sc.nextInt();
		System.out.print("머닝러신: ");
		int num5 = sc.nextInt();
		
		int total = num1+num2+num3+num4+num5;
		double evg = total/5.0;
		System.out.println("총점: " + total);
		System.out.println("평균: "+ evg);
		
		if(evg>=90) {
			System.out.println("학점: A");
		}else if(evg>=80) {
			System.out.println("학점: B");
		}else if(evg>=70) {
			System.out.println("학점: C");
		}else if(evg>=60) {
			System.out.println("학점: D");
		}else {
			System.out.println("학점: F");
		}
	}
}
