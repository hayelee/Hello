package chapter08;

public class Television implements RemoteControl, Searchable { // RemoteControl을 Television이라는 클래스가 구현한다는 뜻

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > max_volume) {
			this.volume = max_volume;
		} else if (volume < min_volume) {
			this.volume = min_volume;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

	@Override
	public void search(String word) {
		System.out.println(word + "을 검색한 결과입니다.");
	}
}