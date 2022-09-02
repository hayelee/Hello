package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");

		System.out.print("프로그래밍 기초: ");
		int s1 = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int s2 = scanner.nextInt();
		System.out.print("화면 구현: ");
		int s3 = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int s4 = scanner.nextInt();
		System.out.print("머신러닝: ");
		int s5 = scanner.nextInt();

		int total = s1 + s2 + s3 + s4 + s5;
		System.out.println("총점: " + total);
		double e = total / 5.0;
		System.out.println("평균: " + e);

		double score = e;

		if (score >= 90) {
			System.out.println("학점: A");
		} else if (score >= 80) {
			System.out.println("학점: B");
		} else if (score >= 70) {
			System.out.println("학점: C");
		} else if (score >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
	}
}