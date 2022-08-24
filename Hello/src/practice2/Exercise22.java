package practice2;

public class Exercise22 {
	public static void main(String[] args) {
		double distance = 40e12;
		double s = 300000;
		double result = distance / s /(60*60*24*365);

		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는 데 걸리는 시간은"+ result +"광년이다.");
	}
}
