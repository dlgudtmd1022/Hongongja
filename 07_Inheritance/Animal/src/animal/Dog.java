package animal;

public class Dog extends animal {

	public Dog() {
		this.kind = "포유류";
		
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	
	
}
