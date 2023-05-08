package sec02.exam02;

public class IncreaseDecreaseOperatorExam {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("----------------");
		x++;//x=+1
		++x;//x=+1
		System.out.println(x);//x=12
		
		System.out.println("----------------");
		y--;//y=-1
		--y;//y=-1
		System.out.println(y);//y=8
		
		System.out.println("----------------");
		z=x++;//z=12(x의 값이 먼저 z에 저장되어 z의 값은 12) , x=12+1=13(x의 값 12와 +1을 더하여 x의 값은 13)
		System.out.println(z);//z=12
		System.out.println(x);//x=13
		
		
		System.out.println("----------------");
		z=++x;
		System.out.println(z);//z=14
		System.out.println(x);//x=14
		
		System.out.println("----------------");
		z=++x+y++;//z=1+14+8=23 //x=1+14=15 // y=8+1=9
		System.out.println(z);//z=23
		System.out.println(x);//x=15
		System.out.println(y);//y=9
	}

}
