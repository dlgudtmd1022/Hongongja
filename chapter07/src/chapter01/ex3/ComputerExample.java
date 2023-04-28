package chapter01.ex3;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Cc cc = new Cc();
		System.out.println("원면적 : " + cc.aC(r));
		System.out.println();
		
		Computer ct = new Computer();
		System.out.println("원면적 : " + ct.aC(r));
	}
}
