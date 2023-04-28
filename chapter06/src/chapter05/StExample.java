package chapter05;

public class StExample {

	public static void main(String[] args) {
		
	
//	St obj1 = new St();
//	St obj2 = new St(); // 
	
	St obj1 = St.getinstance();
	St obj2 = St.getinstance();
	
	
	if(obj1 == obj2) {
		System.out.println("동일한 Singleton");
	}else {
		System.out.println("다른 Singleton");
	}
}
}
