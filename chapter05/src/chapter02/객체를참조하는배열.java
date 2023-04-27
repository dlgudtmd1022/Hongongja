package chapter02;

public class 객체를참조하는배열 {

	public static void main(String[] args) {
		String [] sA = new String[3];
		sA[0] = "Java";
		sA[1] = "Java";
		sA[2] = new String("Java");
		
		System.out.println(sA[0] == sA[1]);
		System.out.println(sA[0] == sA[2]);
		System.out.println(sA[0].equals(sA[2]));
	}
}
