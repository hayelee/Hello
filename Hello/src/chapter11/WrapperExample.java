package chapter11;

public class WrapperExample {
	public static void main(String[] args) {
		int a = 10; // 기본타입
		// Integer b = new Integer(100);
		Integer b = 100; // 참조타입, autoboxing(자동으로 박싱됨)

		int d = b;// auto unboxing - 참조타입->기본타입이 되는 것

		// String c = new String("홍길동");
		String c = "홍길동";

		// 1부터 100까지의 합을 구하는 프로그램
		long startTime = System.nanoTime();
		Integer sum = 0;
//		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum = sum + i;
		}
		System.out.println("합계: " + sum);
		long endTime = System.nanoTime();
		System.out.println("걸린시간: " +(endTime-startTime));
	}
}
