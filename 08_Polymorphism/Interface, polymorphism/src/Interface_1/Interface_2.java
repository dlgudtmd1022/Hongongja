package Interface_1;

public class Interface_2 {

	public class Television implements RemoteControl{
		private int volume;
		
		public void turnOn() {
			System.out.println("Tv on");
		}
		
		public void turnOff() {
			System.out.println("Tv off");
		}
		
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println(this.volume);
		}
		
	}
	
}
