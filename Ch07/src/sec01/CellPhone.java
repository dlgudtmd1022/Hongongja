package sec01;

public class CellPhone {

	String model;
	String color;

	void powerOn() { System.out.println("������ �մϴ�."); }	
	void powerOff() { System.out.println("������ ���ϴ�."); }
	void bell() { System.out.println("���� �︳�ϴ�."); }	
	void sendVoice(String message) { System.out.println("�ڱ�: " + message); }	
	void receiveVoice(String message) { System.out.println("����: " + message); }	
	void hangUp() { System.out.println("��ȭ�� �����ϴ�."); }
}

