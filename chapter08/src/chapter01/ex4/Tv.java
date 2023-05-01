package chapter01.ex4;

import chapter01.ex3.RemoteControl;

public class Tv implements RemoteControl {
	
	private int volume;
	
	public void On() {
		System.out.println("켜기");
	}
	
	public void Off() {
		System.out.println("끄기");
	}
	
	public void sV(int volume) {
		if(volume > RemoteControl.Max_V) {
			this.volume = RemoteControl.Max_V;
		}else if(volume < RemoteControl.Min_V) {
			this.volume = RemoteControl.Min_V;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}	
}
