package sec02.e5;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";  //(�Ұ���)
		parent.method3();         //(�Ұ���)
		*/
		
		Child child = (Child) parent;
		child.field2 = "yyy";  //(����)
		child.method3();     //(����)
	}
}
