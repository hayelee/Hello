package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
//		new RemoteControl(); --구현메소드가 없으니까 안됨
		RemoteControl control = new Television();
		control.turnOn(); //동작은 new Television < 얘가함
		control.setVolume(5);
		
		control = new Audio();
		control.turnOn();
		control.setVolume(5);
		
		Television tv = new Television();
		RemoteControl control2 = tv;
		Searchable serchable = tv;
		control2.turnOn();
		control2.setVolume(7);
		tv.search("홍길동");
	}
}