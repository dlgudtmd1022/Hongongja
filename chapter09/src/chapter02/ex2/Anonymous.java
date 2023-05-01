package chapter02.ex2;

public class Anonymous {

	
	RemoteControl field = new RemoteControl() {
		@Override
		public void On() {
			System.out.println("Tv를 켭니다.");
		}
		@Override
		public void Off() {
			System.out.println("Tv를 끕니다.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void On() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void Off() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.On();
	}
	void method2(RemoteControl rc) {
		rc.On();
	}
}
