package sec02.exam07;

public class ArrayReferenceObjectExam {

	public static void main(String[] args) {
		//객체를 참조하는 배열
		//String은 클래스 이므로 String[]배열은 각 항목에 문자열이 아니라,
		//String 객체의 번지를 가지고 있다. 즉 String[]배열은 String객체를 참조한다.
		String[] strArray = new String[3];
		strArray[0]="Java";
		strArray[1]="Java";
		strArray[2]=new String("Java");
		
		System.out.println(strArray[0]==strArray[1]);
		System.out.println(strArray[0]==strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));

	}

}
