package chapter08;

//public abstract class RemoteControl {
//	private int volume;
//	
//public static final int max_volume = 10;
//public static final int min_volume = 0;
//public abstract void turnOn();
//public abstract void turnOff();
//public abstract void setVolume(int volume);
//}

public interface RemoteControl{
	int max_volume = 10;//public static final을 붙이지 않아도 컴파일할때 자동으로 붙음
	final int min_volume = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}