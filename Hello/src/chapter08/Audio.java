package chapter08;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
	System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
	System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}
