package Method;

public class Calculator3 {
	
	double areaRectangle(double width) {
		return width * width;
	}
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
