package chapter03;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
		int c1 = scanner.nextInt();

		System.out.print("총 인구는?(단위: 만) ");
		int t1 = scanner.nextInt();

		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");

		int p1 = scanner.nextInt();

		String metro = ((c1 == 1) && (t1 >= 100)) || (p1 >= 50) ? "입니다." : "가 아닙니다.";

		System.out.println("이 도시는 메트로폴리스" + metro);

	}
}