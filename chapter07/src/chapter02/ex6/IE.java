package chapter02.ex6;

public class IE {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child chlid = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		}else{
			System.out.println("methid1 - child로 변환되지 않음");
		}
	}	
		
		public static void method2(Parent parent) {
			Child child = (Child) parent;
			System.out.println("method- Child로 변환 성공");	
		}
		public static void main(String[] args) {
			Parent pA = new Child();
			method1(pA);
			method2(pA);
		
			Parent pB = new Parent();
			method1(pB);
			method2(pB);
		
		}
				
	}

