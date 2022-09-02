package chapter05;

public class Exercise51 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE; // int max = array[0];
		int min = Integer.MAX_VALUE; // int min = array[0];
		int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

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