package practice2;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도:1, 수도아님:0) ");
		int metro = sc.nextInt();
		System.out.print("총 인구는?(단위: 만) ");
		int total = sc.nextInt();
		System.out.print("연 소득이 1억 이상인 인구는?(단위: 만) ");
		int pop = sc.nextInt();
		
		String met = ((metro==1)&&(total>=100)||(pop>=50) ? "입니다":"가아닙니다");

		System.out.println("이 도시는 메트로폴리스"+met);
	}
}
