package chapter02.ex2;

public class AnonymousExample {
public static void main(String[] args) {
	Anonymous anony = new Anonymous();
	
	anony.field.On();
		
	anony.method1();
	
	anony.method2(
			new RemoteControl() {
				@Override
				public void On() {
					System.out.println("STV를 켭니다.");
				}
				@Override
				public void Off() {
					System.out.println("STV를 끕니다.");
				}
			}
			);
}
}
