package chapter02.ex1;

public class AnnoymousExample {

	public static void main(String[] args) {
		 Annoymous anony = new  Annoymous();
		 
		 anony.field.wake();
		 
		 anony.method1();
		 
		 anony.method2(
			 new Person() {
				 void study() {
					 System.out.println("공부합니다.");
				 }
			 @Override
			 void wake() {
				 System.out.println("8시에 일어납니다.");
			 study();
			}
		}
		);
	}
}
