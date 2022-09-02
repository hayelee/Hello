package chapter05;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0; // 초기값이 가장 작은 수
		int min = Integer.MAX_VALUE; // 초기값이 가장 큰 수
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}