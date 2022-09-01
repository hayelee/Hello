package chapter10;

import java.util.Scanner;

import chapter08.Student;

public class ExceptionExample {
	public static void main(String[] args) {
		// 1. 일반 예외
		try { // 실행하고
			Class.forName("java.Iang.String");
		} catch (ClassNotFoundException e) { // 에러가 발생하면 캐치함

//			e.printStackTrace();
			System.out.println("입력하신 클래스가 존재하지 않습니다.");
		} // 작성을 완벽하게 한 것 같은데 에러가 뜸(빨간줄)

	
			try (Scanner scanner = new Scanner(System.in)) {
				int nextInt = scanner.nextInt();
				System.out.println(nextInt);
			}
		
			
		// 2. 실행예외
		try {
			Student student = null;
			student.compareTo(new Student("홍길동", 10));
			int[] numbers = {1, 2, 3};       //실행 안됨
			System.out.println(numbers[5]);  //실행 안됨
		} catch (NullPointerException e) {                  //상위 에러클래스가 위로 올라오고 하위 에러클래스가 밑으로 내려와야함(순서가 중요)
			System.out.println("Null 참조 에러 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 에러");
		} catch (Exception e) {
			e.printStackTrace();  //오류 경로 찾는 역할
//			System.out.println("알 수 없는 예외가 발생했습니다.");
		} finally {          //트라이캐치문이 실행될때 반드시 호출되는 곳
			System.out.println("반드시 출력해야 할 문장");
		} // 코드는 문제 없어, 실행을 해봐야 에러가 간 걸 알아

	}
}
