package sec02.e2;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		anony.field.turnOn();

		anony.method1();

		anony.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV on.");
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV off.");
				}
			}
		);
	}
}
