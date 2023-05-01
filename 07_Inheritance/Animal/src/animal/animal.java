package animal;

public abstract class animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉼");
	}
	
	public abstract void sound();
	
}
