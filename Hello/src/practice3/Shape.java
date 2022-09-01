package practice3;

public abstract class Shape implements Comparable<Shape> {  //< >안의 타입이 붙어
	String name;
 
	/**
	 * 면적구하기
	 * @return
	 */
	public abstract double area();
	
	/**
	 * 둘레 구하기
	 * @return
	 */
	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) {
		if (area() > o.area()) {
			return 1;
		} else if (area() < o.area()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override 
	public String toString() {
		return String.format("도형의 종류: %s, 둘레: %f.2㎝, 넓이: %f.2㎠", name, perimeter(), area());
	}
}
