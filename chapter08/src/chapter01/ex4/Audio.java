package chapter01.ex4;

import chapter01.ex2.RemoteControl;

public class Audio implements RemoteControl{

	private int volume;
	
	public void On() {
		System.out.println("Audio 켜기");
	}
	public void Off() {
		System.out.println("Audif 끄기");
	}
	
	public void sV(int volume) {
		if (volume > RemoteControl.Max_V) {
			this.volume = RemoteControl.Max_V;
		}else if(volume < RemoteControl.Min_V) {
			this.volume = RemoteControl.Min_V;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}
