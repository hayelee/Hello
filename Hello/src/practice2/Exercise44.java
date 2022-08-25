package practice2;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임!");
		
		System.out.print("철수: ");
		String cs = sc.nextLine();
		System.out.print("영희: ");
		String yh = sc.nextLine();
		
		if(cs.equals(yh)) {
			System.out.println("결과: 비겼습니다.");	
		}else if(cs.equals("가위")&&yh.equals("바위") || cs.equals("바위")&&yh.equals("보") || cs.equals("보") && yh.equals("가위")) {
			System.out.println("결과: 영희 승리!");
		}else {
			System.out.println("결과: 철수 승리!");
		}
	}
}
