package sec01.exam05;

import sec01.exam03.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV On");
	}
	public void turnOff() {
		System.out.println("TV Off");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재TV볼륨: "+this.volume);
	}
	public void search(String url) {
		System.out.println(url+"검색");
	}

}
