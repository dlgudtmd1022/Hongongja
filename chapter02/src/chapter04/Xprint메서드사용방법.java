package chapter04;

public class Xprint메서드사용방법 {

	public static void main(String[] args) {
		int v = 123;
		System.out.printf("상품의 가격:%d원\n", v);
		System.out.printf("상품의 가격:%6d원\n", v);
		System.out.printf("상품의 가격:%-6d원\n", v);
		System.out.printf("상품의 가격:%06d원\n", v);
		
		double area = 3.14159*10*10;
//		System.out.printf("반지름이 10인 원의 넓이:%10.2f\n", 10, area);
	
		String name = "홍길동";
		String job = "도적";
//		System.out.printf("%6d : % -10s : %10s\n", 1, name, job);
	
	}
}
