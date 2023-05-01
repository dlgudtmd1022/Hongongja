package chapter02.ex1;

public class Annoymous {

	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시 기상");
			work();
		}
	};
		void method1() {
			Person localVar = new Person() {
				void walk() {
					System.out.println("산책합니다.");
				}
				@Override
				void wake() {
					System.out.println("7시 기상");
					walk();
				}
			};
			localVar.wake();
		
	}
		
		void method2(Person person) {
			person.wake();
		}
}
