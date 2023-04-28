package chapter03.ex1;

	public abstract class Phone{
		public String owner;
	
	
	public Phone(String owner) {
		this.owner = owner;
	}
		
	public void tOn() {
		System.out.println("전원을 켭니다.");
	}
	public void tOf() {
		System.out.println("전원을 끕니다.");
	}
}
