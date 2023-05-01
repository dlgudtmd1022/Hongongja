package chapter02.ex5;

public class Example {
	public static void main(String[] args) {


	ImplementationC impl = new ImplementationC();
	
	InterfaceA ia = impl;
	ia.methodA();
	System.out.println();
	
	InterfaceA ib = impl;
	ia.methodA();
	System.out.println();
	
	InterfaceC ic = impl;
	ic.methodA();
	ic.methodB();
	ic.methodC();
	
	
	}
}
