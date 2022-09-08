package chapter10;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method2() throws Exception {
		method1();
	}

	public static void method1() throws NumberFormatException, ClassNotFoundException {
		Class.forName("java.lang.String");
	}
}
