package practice3;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return Math.sqrt(3) * side * side / 4.0;
	}

	@Override
	public double perimeter() {
		return side * 3.0;
	}

	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %.2f㎝, 넓이: %.2f㎠", perimeter(), area());
	}
}