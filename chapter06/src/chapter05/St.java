package chapter05;

public class St {

	private static St st1 = new St();
	
	private St() {
		
	}
	static St getinstance() {
		return st1;
	}
}
